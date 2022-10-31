package com.gl.fest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	 @Column(name="firstname")
	 private String firstname;
	 
	 @Column(name="lastname")
	 private String lastname;
	 
	 @Column(name="email")
	 private String email;

	public Customer(String firstname, String lastname, String email) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public Customer() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
	 
}
