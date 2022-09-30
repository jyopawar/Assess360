package com.testingshastra.interviewfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingshastra.interviewfeedback.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
