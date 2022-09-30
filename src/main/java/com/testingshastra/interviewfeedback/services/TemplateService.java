package com.testingshastra.interviewfeedback.services;

import java.util.List;

import com.testingshastra.interviewfeedback.entities.Question;
import com.testingshastra.interviewfeedback.entities.Template;

public interface TemplateService {


	public List<Template> getTemplates(String userId);

	public Template createTemplate(Template template, String userId);

	public List<Question> getQuestions(String userId, long templateId);

	public Question createQuestion(Question question,long templateId);

	//List<Question> getQuestions(String userId, int templateId);

}
