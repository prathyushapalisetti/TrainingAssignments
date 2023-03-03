package com.springcore;

public class Employee {
	
	String empName;
	
	public Employee(String empName) {
		super();
		this.empName = empName;
	}
	
	public Employee() {
		super();
	}


	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
