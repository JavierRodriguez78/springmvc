package com.geekshubsacademy.springmvc.models;

public class User {

	private String user;
	
	private String pass;
	
	public User() {
		
	}
	
	public User(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [user=" + user + ", pass=" + pass + "]";
	}
	
}
