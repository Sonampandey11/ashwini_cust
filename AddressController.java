package com.capgemini.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.training.RandomNumerGen;
import com.capgemini.training.customer.entity.Address;
import com.capgemini.training.service.AddressService;

@RestController
@RequestMapping("/api/rest/de_DE/adc-customerapi")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	
	@GetMapping("/address/{id}")
	public Address getAddress(@PathVariable Long id) {
		return addressService.getAddress(id);
	}
	
	@PostMapping("/{customerId}/address/create")
	public Address createAddress(@RequestBody Address addr, String customerId) {
		addr.setEntityId(RandomNumerGen.next());
		addressService.save(addr);
		return addr;
	}
	
	@PutMapping("/customers/address/{id}")
	public boolean updateAddress(@PathVariable String id) {
//		addressService.update(id);
		return true;
		
	}
	
}
