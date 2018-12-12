package com.capgemini.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.Survey;
import com.capgemini.training.repository.SurveyRepository;

@Service
public class SurveyService {
	
	@Autowired
	SurveyRepository surveyRepository;
	
	@Transactional
	public void save(Survey cust) {

		surveyRepository.save(cust);
	}

}
