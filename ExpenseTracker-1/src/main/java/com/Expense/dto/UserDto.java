package com.Expense.dto;

public class UserDto {
	private int userId;
	private String firstName;
	private String emailId;

	private String password;

	public UserDto() {
		super();
	}

	public UserDto(int userId, String firstName, String emailId, String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.emailId = emailId;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
