package com.gl.fest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.fest.entity.Customer;
import com.gl.fest.service.CustomerDao;

@Controller
@RequestMapping("customers")
public class CustomerController {
	
	@Autowired
	CustomerDao customerdao;
	
	
	@GetMapping("list")
	public String showCustomer(Model model) {
		List<Customer>customers = customerdao.findAll();
		model.addAttribute("customers", customers);
		return "customer-list";
	}
	  

}
