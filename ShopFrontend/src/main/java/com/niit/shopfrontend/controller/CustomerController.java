package com.niit.shopfrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.Backend.dao.Customer;
import com.niit.Backend.dao.CustomerDao;

@Controller
public class CustomerController {
	
@Autowired
CustomerDao customerDao;

@RequestMapping(value="addCustomer", method=RequestMethod.POST)
public String register(@ModelAttribute("user") Customer customer)
{
	customerDao.addCustomer(customerDao);
	return "Login";
	
}

}
