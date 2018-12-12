package com.capgemini.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.training.mapper.NewCustomer;
import com.capgemini.training.repository.NewCustomerRepository;

@Service
public class NewCustomerService {

	@Autowired
	NewCustomerRepository newCustomerRepository;
	
	@Transactional
	public NewCustomer save(NewCustomer cust) {

		newCustomerRepository.save(cust);
		return cust;
	}
}
