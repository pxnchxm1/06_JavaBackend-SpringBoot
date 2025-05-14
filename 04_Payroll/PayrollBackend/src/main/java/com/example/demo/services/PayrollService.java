package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.PayrollModel;
import com.example.demo.repositories.PayrollRepository;

@Service
public class PayrollService {
	@Autowired
	private PayrollRepository pr;
	
	public List<PayrollModel> getAllPayroll() {
		return pr.findAll();
	}
	public PayrollModel getPayrollById(long id) {
		return pr.findById(id).orElseThrow();
	}
	public void addPayroll(PayrollModel p) {
		pr.save(p);
	}
	public void updatePayroll(long id,PayrollModel p) {
		try {
			PayrollModel existingmodel = pr.findById(id).get();
			existingmodel.setEmpName(p.getEmpName());
			existingmodel.setSalary(p.getSalary());
			pr.save(existingmodel);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deletePayroll(long id) {
		try {
			pr.deleteById(id);
		}catch(Exception e) {
			
		}
	}
}
