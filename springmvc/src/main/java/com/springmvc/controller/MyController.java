package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String firstView() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String secondView() {
		return "hello";
	}
}

// http://localhost:8080/profile