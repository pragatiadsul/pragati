package com.Expense.dto;

import java.util.Date;

public class ExpenseDto {
	private int expenseId;
	private String expenseName;
	private double expenseAmount;
	private Date expensedate;
	private int categoryId;
	
//	private int userId;
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public Date getExpensedate() {
		return expensedate;
	}

	public void setExpensedate(Date expensedate) {
		this.expensedate = expensedate;
	}

	@Override
	public String toString() {
		return "ExpenseDetails [expenseId=" + expenseId + ", expenseName=" + expenseName + ", expenseAmount="
				+ expenseAmount + ", expensedate=" + expensedate + "]";
	}

	public ExpenseDto(int expenseId, String expenseName, double expenseAmount, Date expensedate) {
		super();
		this.expenseId = expenseId;
		this.expenseName = expenseName;
		this.expenseAmount = expenseAmount;
		this.expensedate = expensedate;
	}

	public ExpenseDto() {
		super();
	}

}
