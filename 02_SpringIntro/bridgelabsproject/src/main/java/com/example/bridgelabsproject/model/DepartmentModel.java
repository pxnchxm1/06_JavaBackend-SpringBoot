package com.example.bridgelabsproject.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

public class DepartmentModel {
    @Id
    private String departmentName;

    @Override
    public String toString() {
        return "DepartmentModel{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }

    public DepartmentModel(){}

    public DepartmentModel(String name){
        this.departmentName = name;
    }
    public String getDeptName(){
        return this.departmentName;
    }
    public void setDeptName(String name){
        this.departmentName = name;
    }


}
