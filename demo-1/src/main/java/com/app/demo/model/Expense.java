package com.app.demo.model;



import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="expense")

public class Expense
{
	@Id
	private Long id;
	private Instant expensedate;
	private String descript;
	
	@ManyToOne
	private Category category;
	
	//@JsonIgnore
	@ManyToOne
	private Users user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getExpensedate() {
		return expensedate;
	}
	public void setExpensedate(Instant expensedate) {
		this.expensedate = expensedate;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Expense(Long id, Instant expensedate, String descript, Category category, Users user) {
		super();
		this.id = id;
		this.expensedate = expensedate;
		this.descript = descript;
		this.category = category;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Expense [id=" + id + ", expensedate=" + expensedate + ", descript=" + descript + ", category="
				+ category + ", user=" + user + "]";
	}
	public Expense() {
		super();
	}
	
	
	
	
}
