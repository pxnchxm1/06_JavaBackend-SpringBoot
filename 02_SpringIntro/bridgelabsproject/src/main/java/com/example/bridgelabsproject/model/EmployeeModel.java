package com.example.bridgelabsproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

public class EmployeeModel {
    @Id
    private int id;
    private String name;


    private DepartmentModel department;

    public EmployeeModel(int id,  String name,DepartmentModel department) {
        this.id = id;
        this.name = name;
        this.department = department;

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public DepartmentModel getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "EmployeeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(DepartmentModel department) {
        this.department = department;
    }
}
