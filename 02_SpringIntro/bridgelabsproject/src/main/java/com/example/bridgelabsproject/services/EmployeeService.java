package com.example.bridgelabsproject.services;

import com.example.bridgelabsproject.model.DepartmentModel;
import com.example.bridgelabsproject.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<EmployeeModel> employeelist = new ArrayList<>(
            List.of(
                    new EmployeeModel(1, "Priya", new DepartmentModel("Sales")),
                    new EmployeeModel(2, "Ben", new DepartmentModel("HR")),
                    new EmployeeModel(3,"Paxton",new DepartmentModel("Sales")),
                    new EmployeeModel(4,"Devi",new DepartmentModel("Marketing")),
                    new EmployeeModel(5,"Elanor",new DepartmentModel("HR"))
                    
            )
    );


    public EmployeeModel getEmployeeById(int empId) {
        return employeelist.stream()
                .filter(employee -> employee.getId() == empId)
                .findFirst()
                .orElse(null);
    }
    public List<EmployeeModel> getAllEmployees(){
        return employeelist;
    }

    public void addEmployee(EmployeeModel emp){
        employeelist.add(emp);
    }
    public void updateEmployeeById(int empId,EmployeeModel emp){
        employeelist.stream()
                .filter(employee -> employee.getId() == empId)
                .findFirst()
                .ifPresent(existingEmployee -> {
                    int index = employeelist.indexOf(existingEmployee);
                    employeelist.set(index, emp);
                });
    }
    public void deleteEmployee(int empId){
        employeelist.removeIf(e -> e.getId()==empId);
    }
    
}
