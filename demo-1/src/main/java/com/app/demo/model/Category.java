package com.app.demo.model;

import javax.persistence.*;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
*/
//import org.apache.tomcat.jni.User;
import org.hibernate.annotations.Cascade;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
//@NoArgsConstructor
@Table(name="category")
public class Category 
{
	@Id
	//@JsonProperty
	private Long id;
	//Travel,Grocery
	//@JsonProperty
	@NotNull
	private String name;
	
	
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


	/*	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Users user;
	
*/
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}


}
