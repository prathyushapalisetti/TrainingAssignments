package com.springmvcmv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvcmv.model.Employee;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String firstView() {
		return "index";
	}
	
	@RequestMapping("/employeeForm")
	public String empForm(Model model) {
		Employee obj = new Employee();
		model.addAttribute("employee", obj);
		
		return "employee-page";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("employee") Employee obj) {
		return "confirmation-page";
	}

}

// http://localhost:8080/submitForm
