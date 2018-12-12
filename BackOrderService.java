package com.capgemini.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.BackOrder;
import com.capgemini.training.repository.BackOrderRepository;

@Service
public class BackOrderService {

	@Autowired
	BackOrderRepository backOrderRepository;
	
	@Transactional
	public void save(BackOrder cust) {

		backOrderRepository.save(cust);
	}
	
}
