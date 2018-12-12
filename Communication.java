package com.capgemini.training.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Communication {
	
	@Id
	@GeneratedValue
	private Long id;
	    private String customerId;
	    private String email;
	    
	    @OneToOne
	    private Permission permission;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Permission getPermission() {
			return permission;
		}

		public void setPermission(Permission permission) {
			this.permission = permission;
		}
	    
	   
}
