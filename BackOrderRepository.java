package com.capgemini.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.training.customer.entity.BackOrder;

public interface BackOrderRepository extends JpaRepository<BackOrder, Long> {

}
