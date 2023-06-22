package com.example.demo.model;

public class User {

	private long userId;
	private String namePrefix;
	private String firstName;
	private String lastName;
	
	public User() {
	}


	public User(long userId, String namePrefix, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.namePrefix = namePrefix;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
