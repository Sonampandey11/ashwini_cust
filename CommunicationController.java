package com.capgemini.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.training.customer.entity.Communication;
import com.capgemini.training.service.CommunicationService;

@RestController
@RequestMapping("/api/rest/de_DE/adc-customerapi")
public class CommunicationController {

	
	@Autowired
	CommunicationService communicationService;
	
	@GetMapping("/permission")
	public List<Communication> getAllCommunication() {
		return communicationService.getAllCommunication();
	}
	
	@GetMapping("/permission/{id}")
	public Communication getCommunication(@PathVariable Long id) {
		return communicationService.getCommunication(id);
	}
	
	@PostMapping("/customers/permission")
	public void createCommunication(@RequestBody Communication cust) {
		communicationService.save(cust);
	}
	
	@PutMapping("/customers/communication/update/{magCustid}")
	public boolean updateCommunications(@RequestBody Communication cust,@PathVariable("magCustid") String magCustid) {
		communicationService.update(Long.valueOf(magCustid));
		return true;
	}
	
	@DeleteMapping("/permission/{id}")
	public void deleteCommunication(@PathVariable Long id) {
		communicationService.delete(id);
	}
	
}
