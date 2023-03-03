package com.springmvcbr.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	
	private String firstName;
	@Size(min = 1, message = "last name is a requires field")
//	@Size(max = 5, message = "last name is a requires field")
//  @Pattern(regexp = "[a-zA-Z{3}",message = "last name should be of 3 characters only")
	private String lastName;
	public Employee(String firstName, String lastName) {
		
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
