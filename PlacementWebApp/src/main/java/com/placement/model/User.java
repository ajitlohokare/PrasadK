package com.placement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
		
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String username;
	private String email_id;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email_id=" + email_id + ", password=" + password
				+ ", role=" + role + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String username, String email_id, String password, String role) {
		super();
		this.id = id;
		this.username = username;
		this.email_id = email_id;
		this.password = password;
		this.role = role;
	}
	
	
	
	
	
}
