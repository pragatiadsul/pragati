package com.Expense.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.dto.CategoryDto;
import com.Expense.exception.CategoryNotFoundException;
import com.Expense.model.Category;
import com.Expense.model.User;
import com.Expense.service.ICategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private ICategoryService categoryService;

	/**
	 * Method used to add Category
	 * 
	 * @param Category
	 * @return status string
	 */
	@PostMapping("/addCategory")
	public ResponseEntity<String> addCategory(@RequestBody CategoryDto categoryDto) {
		return new ResponseEntity<String>(categoryService.addCategory(categoryDto), HttpStatus.OK);
	}

	/**
	 * Method used to fetch CategoryList
	 * 
	 * @param No any parameter pass
	 * @return category List
	 */

	@GetMapping("/getCategories")
	public ResponseEntity<List<Category>> getAllCategories() {
		return new ResponseEntity<List<Category>>(categoryService.getAllCategories(), HttpStatus.OK);
	}

	/**
	 * Method used to fetch specific id
	 * 
	 * @param id
	 * @return id
	 */

	@GetMapping("/categorylist/{id}")
	public ResponseEntity<Category> getCategoryid(@PathVariable(value = "id") int categoryId) {

		Category category = categoryService.getCategoryById(categoryId);

		if (category == null)
			return ResponseEntity.notFound().build();

		return ResponseEntity.ok().body(category);
	}

	
	
	/**
	 * Method used to fetch specific category name
	 * 
	 * @param category object
	 * @return category
	 */
	@PostMapping("/categoryName")
	private Category getCategoryBYName(@RequestBody Category category) {

		String name = category.getCategory();
		return categoryService.FindByCategory(name);
	}

}
