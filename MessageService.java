package com.capgemini.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.Message;
import com.capgemini.training.repository.MessageRepository;

@Service
public class MessageService {

	
	@Autowired
	MessageRepository messageRepository;
	
	@Transactional
	public void save(Message msg) {

		messageRepository.save(msg);
	}
}
