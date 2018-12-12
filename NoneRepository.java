package com.capgemini.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.training.customer.entity.News;
import com.capgemini.training.customer.entity.None;

public interface NoneRepository extends JpaRepository<None, Long> {

}
