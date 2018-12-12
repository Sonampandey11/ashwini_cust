package com.capgemini.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.Communication;
import com.capgemini.training.repository.CommunicationRepository;

@Service
public class CommunicationService {

	@Autowired
	CommunicationRepository communicationRepository;

	@Transactional
	public void save(Communication cust) {

		communicationRepository.save(cust);
	}

	@Transactional
	public void delete(Long id) {
		communicationRepository.deleteById(id);
	}
	
	@Transactional
	public void update(Long id) {
		Optional<Communication> customerList = communicationRepository.findById(id);
		Communication communication = null ;
		if (customerList.isPresent()) {
			communication = customerList.get();
			communication.setEmail("pooja@cap.com");
		}
		if(null != communication) {
			communicationRepository.save(communication);
		}
	}
	
	public List<Communication> getAllCommunication() {
		List<Communication> communication = new ArrayList<>();
		for (Communication comm : communicationRepository.findAll()) {
			communication.add(comm);
		}
		return communication;
	}
	
	
	public Communication getCommunication(Long id) {
		return communicationRepository.findById(id).get();
	}
}
