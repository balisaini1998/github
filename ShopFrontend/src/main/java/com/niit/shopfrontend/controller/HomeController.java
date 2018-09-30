package com.niit.shopfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.Backend.dao.CategoryDao;
import com.niit.Backend.dao.CategoryDaoImpl;
import com.niit.Backend.dao.Customer;
import com.niit.Backend.dao.CustomerDao;
import com.niit.Backend.dao.ProductDao;
import com.niit.Backend.model.Category;
import com.niit.Backend.model.Product;;

@Controller
public class HomeController {
	@Autowired
	
	  Category category;
	
	


	@Autowired
	
	 CategoryDao Categorydao;
	
	@Autowired
	
	 Product  product;
	
	@Autowired
	
	ProductDao  productDao;
	
	@Autowired
	 Customer customer;
	
	@Autowired
	CustomerDao customerDao;
	 
	
	@RequestMapping("/")
	public String rootPage()
	{
		return "index";
		
	}
	
	
		@RequestMapping("index")
		public String homePage()
		{
			return "index";
			
		}
		
		@RequestMapping("/login")
		public String loginPage()
		{
			
			return "Login";
		}
		
		@RequestMapping("/registration")
		public String registrationPage()
		{
			
			return "registration";
			
		}
	
	
	@RequestMapping("/Category")
	public String categoryPage(Model model)
	{ 
		List<Category> allCategory=Categorydao.getAllCategory();
		model.addAttribute("cat",category);
		model.addAttribute("categoryList",allCategory);
		return "Category";
		
	}


	
@RequestMapping("/Product")
public String productPage(Model model)
{
	
	List<Product> allProducts= productDao.getAllProduct();
	List<Category> allCategory= Categorydao.getAllCategory();
	model.addAttribute("productOBJ", product);
	model.addAttribute("productList",allProducts);
	model.addAttribute("catgeoryList",allCategory);
	
	return "Product";
	
} 


}

	
	
	
	
	
	
	
	
	
	

