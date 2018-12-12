package com.capgemini.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.Address;
import com.capgemini.training.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;

	@Transactional
	public void save(Address addr) {

		addressRepository.save(addr);
	}

	@Transactional
	public void delete(Long id) {
		addressRepository.deleteById(id);
	}
	
	@Transactional
	public void update(Long id) {
		Optional<Address> customerList = addressRepository.findById(id);
		Address address = null ;
		if (customerList.isPresent()) {
			address = customerList.get();
			//address.setStreet("streetSecond");
		}
		addressRepository.save(address);
	}
	
	public List<Address> getAllAddress() {
		List<Address> address = new ArrayList<>();
		for (Address addr : addressRepository.findAll()) {
			address.add(addr);
		}
		return address;
	}
	
	
	public Address getAddress(Long id) {
		return addressRepository.findById(id).get();
	}

}
