package com.Expense.dto;

public class CategoryDto {
	private Integer categoryId;
	private String category;

	public CategoryDto(Integer categoryId, String category) {
		super();
		this.categoryId = categoryId;
		this.category = category;
	}

	public CategoryDto() {
		super();
	}

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

}
