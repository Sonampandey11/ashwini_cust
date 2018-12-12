package com.capgemini.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.training.customer.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

}
