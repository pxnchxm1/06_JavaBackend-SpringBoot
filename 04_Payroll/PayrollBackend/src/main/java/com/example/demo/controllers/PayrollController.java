package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.models.PayrollModel;
import com.example.demo.services.PayrollService;

@RestController
@RequestMapping("/payroll")
public class PayrollController {
	
	@Autowired
	private PayrollService ps;
	
	@GetMapping("/")
	public List<PayrollModel> checkPayroll() {
		return ps.getAllPayroll();
	}
	@GetMapping("/{id}")
	public PayrollModel getPayrollById(@PathVariable long id) {
		return ps.getPayrollById(id);
	}
	
	@PostMapping("/")
	public void addPayroll(@RequestBody PayrollModel p) {
		 ps.addPayroll(new PayrollModel(p.getEmpName(),(Double)p.getSalary()));
	}
	@PutMapping("/{id}")
	public void updatePayroll(@PathVariable long id,@RequestBody PayrollModel p) {
		ps.updatePayroll(id, 
				new PayrollModel(p.getEmpName(),(Double)p.getSalary()));
	}
	@DeleteMapping("/{id}")
	public void deletePayroll(@PathVariable long id) {
		ps.deletePayroll(id);
	}
}
