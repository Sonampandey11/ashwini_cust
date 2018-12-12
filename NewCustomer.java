package com.capgemini.training.mapper;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewCustomer {

	@Id
	private int newId;

	private String newName;
	private String newAddress;
	private String newPhone;

	public int getNewId() {
		return newId;
	}

	public void setNewId(int newId) {
		this.newId = newId;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public String getNewAddress() {
		return newAddress;
	}

	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}

	public String getNewPhone() {
		return newPhone;
	}

	public void setNewPhone(String newPhone) {
		this.newPhone = newPhone;
	}

}
