package com.capgemini.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.None;
import com.capgemini.training.repository.NoneRepository;

@Service
public class NoneService {

	
	@Autowired
	NoneRepository noneRepository;
	
	@Transactional
	public void save(None cust) {

		noneRepository.save(cust);
	}
}
