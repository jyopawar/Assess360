package com.testingshastra.interviewfeedback.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity

public class User {
	@Id
	private String userId;
	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private String phone;
	
	//@RestResource(exported = false)
	@OneToMany(mappedBy="user")
    @JsonManagedReference

    @JsonIgnoreProperties("User")

	private List<Template> userTemplates;

	public User(String id, String firstName, String lastName, String password, String confirmPassword, String phone) {
		super();
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phone = phone;
		// Create empty arraylist of templates for new user
		// this.userTemplates = new ArrayList<Template>();
	}
	public User() {
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String id) {
		this.userId = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Template> getUserTemplates() {
		return userTemplates;
	}

	public void setUserTemplates(List<Template> userTemplates) {
		this.userTemplates = userTemplates;
	}

	

}
