package com.gl.fest.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.fest.entity.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	SessionFactory factory;
	
	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(customer);

	}
    @Override
	@Transactional
	public void deleteCustomer(String email) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		Customer cus = session.get(Customer.class, email);
		session.delete(cus);
		
		
	}
    @Override
	@Transactional
	public Customer findByEmail(String email) {
		// TODO Auto-generated method stub
    	Session session = factory.getCurrentSession();
    	
		return session.get(Customer.class, email);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		Criteria c = session.createCriteria(Customer.class);
		return c.list();
	}

}
