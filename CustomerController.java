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

import com.capgemini.training.RandomNumerGen;
import com.capgemini.training.customer.entity.Address;
import com.capgemini.training.customer.entity.Communication;
import com.capgemini.training.customer.entity.Customer;
import com.capgemini.training.mapper.NewCustomer;
import com.capgemini.training.service.CustomerService;
import com.capgemini.training.service.NewCustomerService;

@RestController
@RequestMapping("/api/rest/de_DE/adc-customerapi")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	NewCustomerService newCustomerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}
	//get customer
	@GetMapping("/customer/{customerId}/get")
	public Customer getCustomer(@PathVariable String customerId) {
		Customer customer=new Customer();
		 Customer cust=customerService.getCustomer(customerId, customer);
		 return cust;
	}
	//create customer
	@PostMapping("/customer/create")
	public Customer createCustomer(@RequestBody Customer cust) {
		cust.setEntityId(RandomNumerGen.next());
		customerService.save(cust);
		return cust;
	}
	//update customer
	@PutMapping("/customer/{customerId}/update")
	public Customer updateCustomer(@RequestBody Customer cust, @PathVariable String customerId) {
		return customerService.update(customerId,cust);
	
	}
	
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		customerService.delete(id);
	}
	
	@GetMapping("/customers/{id}/addresses")
	public Address getCustomerAddress(@PathVariable Long id)
	{
		return customerService.getCustomerAddress(id);
	}
	
	@PutMapping("/customers/addresses/{id}")
	public void updateCustomerAddress(@PathVariable Long id)
	{
		customerService.updateAddress( id);
	}
	
	//getAddressof customer
	@GetMapping("/{customerId}/address/{addressId}/get")
	public Address getCustomerAddressById(@PathVariable("customerId") String customerId,@PathVariable("addressId") String addressId)
	{
		return customerService.getCustomerAdressById(customerId, addressId);
	}
	//update of address
	@PutMapping("/{customerId}/address/{addressId}/update")
	public Address updateCustomerAddressById(@RequestBody Address address, @PathVariable("customerId") String customerId, @PathVariable("addressId") String addressId )
	{
		return customerService.updateAddressById(address, customerId,addressId);
	}
	
	//createAddress
	//@PostMapping("/{customerId}/address/create")
	public Address createCustomerAddress(@PathVariable("customerId") String customerId, @RequestBody Address address)
	{        address.setEntityId(RandomNumerGen.next());
	        Customer cust=new Customer();
		return customerService.createcustomerAddress(customerId, address,cust);
	}
	
	//get permission of customer
	@GetMapping("/permission/{customerId}/get")
	public Communication getCommunication(@PathVariable String customerId) {
		
		return customerService.getCustomerCommunication(customerId);
	}
	
	@PostMapping("/newCustomer")
	public NewCustomer saveNewCustomer(@RequestBody NewCustomer cust ) {
		
		newCustomerService.save(cust);
		return cust;
	}
}
