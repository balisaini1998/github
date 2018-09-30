package com.niit.Backend.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Category implements Serializable 
{

	@Id //primary key
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private int categoryId;
    private String categoryName;
    private String categoryDescription; 
	
    public int getCategoryId() {
		return categoryId;
    }
    
    public void setCategoryId(int categoryId) {
    	this.categoryId=categoryId;
    }
    
    public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
		
	
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
    
 }


