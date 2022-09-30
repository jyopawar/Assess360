package com.testingshastra.interviewfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingshastra.interviewfeedback.entities.Question;

public interface QuestionRepository extends JpaRepository<Question,String> {

}
