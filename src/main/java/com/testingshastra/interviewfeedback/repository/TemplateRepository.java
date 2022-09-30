package com.testingshastra.interviewfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingshastra.interviewfeedback.entities.Question;
import com.testingshastra.interviewfeedback.entities.Template;

public interface TemplateRepository extends JpaRepository<Template,Long> {



}
