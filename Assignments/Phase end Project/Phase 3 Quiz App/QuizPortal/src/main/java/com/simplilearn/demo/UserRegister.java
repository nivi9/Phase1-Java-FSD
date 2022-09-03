package com.simplilearn.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRegister 
{
	

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
private String name;
   private String email;
   private String password;
   private String country;
   private long phoneno;
   
   
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}

public UserRegister(int id, String name, String email, String password, String country, long phoneno) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.country = country;
	this.phoneno = phoneno;
}
public UserRegister() {
		// TODO Auto-generated constructor stub
}

   
   
   
}