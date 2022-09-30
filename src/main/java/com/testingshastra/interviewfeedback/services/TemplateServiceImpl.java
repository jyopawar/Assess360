package com.testingshastra.interviewfeedback.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingshastra.interviewfeedback.entities.Question;
import com.testingshastra.interviewfeedback.entities.Template;
import com.testingshastra.interviewfeedback.entities.User;
import com.testingshastra.interviewfeedback.repository.QuestionRepository;
import com.testingshastra.interviewfeedback.repository.TemplateRepository;
import com.testingshastra.interviewfeedback.repository.UserRepository;

@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired
	UserService userService;

	@Autowired
	TemplateRepository tempRepo;
	
	@Autowired
	QuestionRepository quesrepo;
	
	@Autowired
	UserRepository userRepo;
	public TemplateServiceImpl() {

	}

	@Override
	public List<Template> getTemplates(String userId) {
		List<Template> userTemplates = null;
		List<User> users = userService.getUsers();
		boolean isExistingUser = false;
		for (User user : users) {
			if (user.getUserId().equals(userId)) {
				isExistingUser = true;
				userTemplates = user.getUserTemplates();
			}
		}
		
		if(!isExistingUser) {
			throw new ArrayIndexOutOfBoundsException("No user found");
		}
		return userTemplates;
	}
//
	@Override
	public Template createTemplate(Template template, String userId) {
		User user = userRepo.findById(userId).orElse(null); 
		List<Template> userTemplates = user.getUserTemplates();
		System.out.println("Existing templates: "+userTemplates.size());
		tempRepo.save(template);
		userTemplates.add(template);
		user.setUserTemplates(userTemplates);
		return template;
	}
	@Override
	public List<Question> getQuestions(String userId, long templateId) {
		List<Question> templateQuestions = new ArrayList<>();
		List<Template> templates = getTemplates(userId);
		for (Template template : templates) {
			if (template.getTemplateId() == templateId)
				templateQuestions = template.getQuestions();
		}
		return templateQuestions;
	}
 public Question createQuestion(Question question,long templateId) {
		Template template = tempRepo.findById(templateId).orElse(null); 
		List<Question> templateQuestions = template.getQuestions();
		quesrepo.save(question);
		templateQuestions.add(question);
		template.setQuestions(templateQuestions);
		return question;
	}

}
