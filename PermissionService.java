package com.capgemini.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.Permission;
import com.capgemini.training.repository.PermissionRepository;

@Service
public class PermissionService {
	
	@Autowired
	PermissionRepository permissionRepository;
	
	@Transactional
	public void save(Permission cust) {

		permissionRepository.save(cust);
	}

}
