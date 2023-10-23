package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.entity.Product;
import com.simplilearn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
public class ProductController {
	@Autowired
	 ProductService productServie;
	
	@GetMapping("/products")
	public String showProducts(Model m) {
		return "ProductInfo";
	}
	@PostMapping("/addProducts")
		public String addProducts(@RequestParam("txtPname")String pname ,@RequestParam("prodprice")String price,@RequestParam("proddesc")String description,  Model m){
			Product p=new Product();
			p.setPname(pname);
			p.setPrice(price);
			p.setDescription(description);
			productServie.addProduct(p);
			return "ProductInfo";
		}
	
}
