package com.ecom.Services;

import java.util.List;

import com.ecom.Entity.Customers;
import com.ecom.Entity.Feedback;
import com.ecom.Exception.CustomerException;
import com.ecom.Exception.FeedbackException;

public interface CustomersService {
	
	public Customers addCustomer(Customers customer) throws CustomerException;

	public Customers deleteCustomer(Integer customerId) throws CustomerException;

	public Customers getCustomerByID(Integer customerId) throws CustomerException;

	public List<Customers> getAllCustomers() throws CustomerException;

	public List<Feedback> addFeedbackOnCustomer(Integer customerId, Feedback feedback)
			throws CustomerException, FeedbackException;
	
}
