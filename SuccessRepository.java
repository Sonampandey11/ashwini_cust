package com.capgemini.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.training.customer.entity.Success;

@Repository
public interface SuccessRepository extends JpaRepository<Success, Long> {

	
	
}
