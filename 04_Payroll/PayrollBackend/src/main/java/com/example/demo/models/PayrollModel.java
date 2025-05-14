package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "payroll")
public class PayrollModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String empName;
	private double salary;

	public PayrollModel(){}

	public PayrollModel(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PayrollModel{" +
				"id=" + id +
				", empName='" + empName + '\'' +
				", salary=" + salary +
				'}';
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
