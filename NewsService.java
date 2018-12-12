package com.capgemini.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.News;
import com.capgemini.training.repository.NewsRepository;

@Service
public class NewsService {

	
	@Autowired
	NewsRepository newsRepository;
	
	@Transactional
	public void save(News cust) {

		newsRepository.save(cust);
	}
}
