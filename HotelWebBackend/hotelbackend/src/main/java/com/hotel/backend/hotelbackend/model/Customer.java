package com.hotel.backend.hotelbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}