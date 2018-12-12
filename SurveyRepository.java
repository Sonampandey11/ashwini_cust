package com.capgemini.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.training.customer.entity.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

}
