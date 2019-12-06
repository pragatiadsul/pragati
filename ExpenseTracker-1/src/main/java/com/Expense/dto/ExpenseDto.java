package com.Expense.dto;

import java.util.Date;

public class ExpenseDto {
	private int expenseId;
	private String expenseName;
	private double expense_amount;
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

	

	public double getExpense_amount() {
		return expense_amount;
	}

	public void setExpense_amount(double expense_amount) {
		this.expense_amount = expense_amount;
	}

	public Date getExpensedate() {
		return expensedate;
	}

	public void setExpensedate(Date expensedate) {
		this.expensedate = expensedate;
	}

	@Override
	public String toString() {
		return "ExpenseDetails [expenseId=" + expenseId + ", expenseName=" + expenseName + ", expense_amount="
				+ expense_amount + ", expensedate=" + expensedate + "]";
	}

	public ExpenseDto(int expenseId, String expenseName, double expenseAmount, Date expensedate) {
		super();
		this.expenseId = expenseId;
		this.expenseName = expenseName;
		this.expense_amount = expense_amount;
		this.expensedate = expensedate;
	}

	public ExpenseDto() {
		super();
	}

}
