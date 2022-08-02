package com.code.jsf.validate;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentOne {

	private String firstName;
	private String lastName;
	private String email;
	
	public StudentOne() {
		
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
