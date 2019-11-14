package com.Expense.model;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "category")
public class Category
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer categoryId;
private String category;


public Integer getCategoryId() {
	return categoryId;
}
public void setCategoryId(Integer categoryId) {
	this.categoryId = categoryId;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}



@OneToMany(mappedBy = "category",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
private List<Expense> expense;

public Category() {
	super();
}
public List<Expense> getExpense() {
	return expense;
}
public void setExpense(List<Expense> expense) {
	this.expense = expense;
}
public Category(Integer categoryId, String category) {
	super();
	this.categoryId = categoryId;
	this.category = category;
}




}
