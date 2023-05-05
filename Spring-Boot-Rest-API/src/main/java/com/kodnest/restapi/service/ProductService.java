package com.kodnest.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.restapi.entity.Product;
import com.kodnest.restapi.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProducts(){
		return productRepository.findAll();
	}

}
