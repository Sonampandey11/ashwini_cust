package com.capgemini.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.training.customer.entity.Communication;
@Repository
public interface CommunicationRepository extends JpaRepository<Communication, Long>{

}
