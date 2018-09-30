package com.niit.shopfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.Backend.dao.ProductDao;
import com.niit.Backend.model.Product;

public class ProductContorller {
	@Autowired
	ProductDao productRepository;

	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public String productAdd(@ModelAttribute("pro") Product product)
	{
		if(product.getProductId()==0)
		{
		productRepository.addProduct(product);
		}
		else
		{
			productRepository.addProduct(product);
		}
		
		return "redirect:/Product";
	}


@RequestMapping("/deleteProduct/{id}")

public String productDelete(@PathVariable("id") int productId)
{
	productRepository.deleteProduct(productId);
return "redirect:/Product";
}

@RequestMapping("/editCategory/{id}")

public String productUpdate(@PathVariable("id") int productId,Model model)
{
	Product productData=productRepository.getProductById(productId);
model.addAttribute("pro",productData);

List<Product> allProduct= productRepository.getAllProduct();
model.addAttribute("productList",allProduct);
return "Product";
}


}
