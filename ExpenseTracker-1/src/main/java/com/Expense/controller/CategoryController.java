package com.Expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.model.Category;
import com.Expense.service.ICategoryService;



@RestController
@RequestMapping("/user")
public class CategoryController 
{
	@Autowired
	private ICategoryService categoryService;
	
	@PostMapping("/addCategory")
	public ResponseEntity<String> addCategory(@RequestBody Category category)
	{
		return new ResponseEntity<String>(categoryService.addCategory(category),HttpStatus.OK);
	}
	
//@PostMapping("")
	
	@GetMapping("/getCategories")
	public ResponseEntity<List<Category>> getAllCategories(){
		return new ResponseEntity<List<Category>>(categoryService.getAllCategories(),HttpStatus.OK);	
	}
}
