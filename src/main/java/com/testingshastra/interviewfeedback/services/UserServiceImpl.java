package com.testingshastra.interviewfeedback.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingshastra.interviewfeedback.entities.User;
import com.testingshastra.interviewfeedback.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepo;
	//	List<User> users;
//	
//	public UserServiceImpl() {
//		users = new ArrayList<User>();
//	}
//
	@Override
	public User deleteUser(User user) {
		userRepo.delete(user);
		return user;
	}
//	
//	
//
	@Override
	public User createUser(User user) {
		//users.add(user);
		userRepo.save(user);
		return user;
	}
//
	@Override
	public Optional<User> getUser(String id) {
		Optional<User> usr = userRepo.findById(id);
		
		
//		for (User user : users) {
//			if(user.getId().equals(id)) {
//				usr = user;
//				break;
//			}
//		}
		return usr;
	}
//
	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}
//
//

}
