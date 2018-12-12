package com.capgemini.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.training.customer.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

	
	public List<Address> findByEntityId(String addressId);
}
