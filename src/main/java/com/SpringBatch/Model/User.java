package com.SpringBatch.Model;



public class User {
	
	
	
	private int id;
	private String firstName;
	private String lastName;
	private String subject;
	private String result;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public User(int id, String firstName, String lastName, String subject, String result) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
		this.result = result;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


}
