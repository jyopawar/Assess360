package com.testingshastra.interviewfeedback.services;

import java.util.List;
import java.util.Optional;

import com.testingshastra.interviewfeedback.entities.User;

public interface UserService {

	public User deleteUser(User user);
	public User createUser(User user);
	public Optional<User> getUser(String id);
	public List<User> getUsers();
	
}
