package com.niit.Backend.dao;

import java.util.List;

import com.niit.Backend.model.Product;

public interface ProductDao {

    public boolean addProduct(Product product);	
    public boolean updateproduct(Product product);
    public boolean deleteProduct(int productId);
    public List<Product> getAllProduct();
    public Product getProductById(int productId);
    
}

