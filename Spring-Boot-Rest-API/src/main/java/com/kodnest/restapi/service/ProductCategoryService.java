package com.kodnest.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.restapi.entity.ProductCategory;
import com.kodnest.restapi.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	public List<ProductCategory> getProducts(){
		return productCategoryRepository.findAll();
	}
	
}
