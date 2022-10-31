package com.gl.fest.service;

import java.util.List;

import com.gl.fest.entity.Customer;

public interface CustomerDao {
	
	public void saveCustomer(Customer customer);
	public void deleteCustomer(String email);
	public Customer findByEmail(String email);
	public List<Customer>findAll();
	

}
