package com.capgemini.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.training.customer.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
	public List<Customer> findByEntityId(String cId);
}
