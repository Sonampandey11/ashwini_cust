package com.capgemini.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.Success;
import com.capgemini.training.repository.SuccessRepository;

@Service
public class SuccessService {

	
	@Autowired
	SuccessRepository successRepository;
	
	@Transactional
	public void save(Success success) {

		successRepository.save(success);
	}
}
