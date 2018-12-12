package com.capgemini.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.training.mapper.NewCustomer;

public interface NewCustomerRepository extends JpaRepository<NewCustomer, Integer> {

}
