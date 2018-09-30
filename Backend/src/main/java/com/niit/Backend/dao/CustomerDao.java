package com.niit.Backend.dao;


import java.util.List;



public interface CustomerDao {
	public boolean addCustomer(CustomerDao customer);
	public boolean updateCustomer(CustomerDao customer);
	public boolean deleteCustomer(int customerId);
	public List<Customer>getAllCustomer();
	public Customer getCustomerById(int customerId);

}
