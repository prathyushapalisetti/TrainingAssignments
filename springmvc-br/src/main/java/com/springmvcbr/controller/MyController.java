package com.springmvcbr.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvcbr.model.Employee;

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
	public String submitForm(@Valid @ModelAttribute("employee") Employee obj, BindingResult result) {
		if(result.hasErrors())
			return "employee-page";
		
		return "confirmation-page";
	}

}

// http://localhost:8080/submitForm
