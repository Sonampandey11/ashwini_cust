package com.capgemini.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.training.customer.entity.News;

public interface NewsRepository extends JpaRepository<News, Long> {

}
