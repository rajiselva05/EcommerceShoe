package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.entity.Category;
import com.simplilearn.service.CategoryService;



@Controller
public class CategoryController {
	@Autowired(required=true)
	CategoryService categoryService;
	@GetMapping("/home")
public String showHome() {
		return "home";
}
//	@GetMapping("/categories")
//	public String categories(Model m) {
//		
//		return "home";
//	}
	@PostMapping("/addcat")
	public String categories(@RequestParam("txtCname")String cname,Model m) {
		Category c=new Category();
		c.setName(cname);
		categoryService.addCategory(c);
		return "CategoryInfo";
		}
	
}
