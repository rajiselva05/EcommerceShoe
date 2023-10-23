package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Product;
import com.simplilearn.repository.ProductRepository;

@Service
public class ProductService {
	ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public void removeProductById(int id) {
		productRepository.deleteById(id);
	}
	
	public Optional<Product> getProductById(int id){
		return productRepository.findById(id);
	}
}
