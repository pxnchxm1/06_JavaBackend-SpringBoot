package com.example.bridgelabsproject.controllers;

import com.example.bridgelabsproject.model.EmployeeModel;
import com.example.bridgelabsproject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    public EmployeeService es;

    @GetMapping("/")
    public List<EmployeeModel> getEmployees(){
        return es.getAllEmployees();
    }
    @GetMapping("/{empId}")
    public EmployeeModel getEmployee(@PathVariable  int empId){
        return es.getEmployeeById(empId);
    }

    @PostMapping("/")
    public void createEmployee(@RequestBody EmployeeModel emp) {
        es.addEmployee(emp);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody EmployeeModel emp) {
        es.updateEmployeeById(id,emp);
    }

    @DeleteMapping("/{empId}")
    public void deleteEmployee(@PathVariable int empId) {
        es.deleteEmployee(empId);
    }
}
