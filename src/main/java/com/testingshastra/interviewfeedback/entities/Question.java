package com.testingshastra.interviewfeedback.entities;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

@Entity
public class Question {
	@Id
	private int questionId;
	private String questionTitle;
	//private Map<Integer, Integer> scales;
	private String comment;
	@ManyToOne
    @JsonBackReference

	private Template template;

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public Question() {
		super();
	}

	public Question(int questionId, String questionTitle, String comment ,Template template) {
		super();
		this.questionId = questionId;
		this.questionTitle = questionTitle;
	//	this.scales = scales;
		this.comment = comment;
		this.template=template;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

//	public Map<Integer, Integer> getScales() {
//		return scales;
//	}
//
//	public void setScales(Map<Integer, Integer> scales) {
//		this.scales = scales;
//	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
