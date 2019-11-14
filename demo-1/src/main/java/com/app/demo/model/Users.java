package com.app.demo.model;


import java.util.Set;

//import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
*/
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity

//@NoArgsConstructor
@Table(name="users")

public class Users {

	@Id
	private Long id;
	private String name;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

/*	@OneToMany
	private Set<Category> category;
	*/
}
