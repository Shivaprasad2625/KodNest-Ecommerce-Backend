package com.kodnest.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.restapi.entity.ProductCategory;
import com.kodnest.restapi.service.ProductCategoryService;

@RestController
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService service;
	
	@GetMapping("/product-category")
	public List<ProductCategory> findAllProducts(){
		return service.getProducts();
	}
}
