package com.app.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.validator.internal.util.privilegedactions.NewProxyInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.model.Category;
import com.app.demo.repository.CategoryRepository;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;

//	public CategoryController(CategoryRepository categoryRepository) {
//		super();
//		this.categoryRepository = categoryRepository;
//	}
//	
	
@GetMapping("/categories")	
 public ResponseEntity<List<Category>>  categories()
 {
	//System.out.println(categoryRepository.findAll());
	return ResponseEntity.ok().body(categoryRepository.findAll());
	//return new ResponseEntity<List<Category>>(categoryRepository.findAll(),HttpStatus.OK); 
 }
 
//category/2

@GetMapping("/category/{id}")	
ResponseEntity<?> getCategory(@PathVariable Long id)
{
	Optional<Category> category=categoryRepository.findById(id);
	return category.map(response -> ResponseEntity.ok(response))
			.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	
}

@PostMapping("/category")
ResponseEntity<Category> createCategory(@Valid @RequestBody Category category) throws URISyntaxException
{
Category result=categoryRepository.save(category);
return ResponseEntity.created(new URI("/api/category" + result.getId())).body(result);
}

@PutMapping("/category/{id}")	
ResponseEntity<Category> updateCategory(@Valid @RequestBody Category category)
{
	Category result=categoryRepository.save(category);
	return ResponseEntity.ok().body(result);
	}

@DeleteMapping("/category/{id}")
ResponseEntity<?> deleteCategory(@PathVariable Long id)
{
	categoryRepository.deleteById(id);
	return ResponseEntity.ok().build();
}

}
