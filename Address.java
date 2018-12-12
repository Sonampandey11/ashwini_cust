package com.capgemini.training.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private Long id;
	//@JsonProperty(value = "entity_id")
	private String entityId;
	private String prefix;
	private String firstname;
	private String lastname;
	private String city;
	//@JsonProperty(value = "country_id")
	private String countryId;
	private String postcode;
	private String telephone;
	//@JsonProperty(value = "missing_verification")
	private String missingVerification;
	//@JsonProperty(value = "is_default_billing")
	private String isDefaultBilling;
	//@JsonProperty(value = "is_default_shipping")
	private String isDefaultShipping;
	//@JsonProperty(value = "customer_id")
	private String customerId;
	@OneToOne
	private Message messages;
	private String street;
	
	private String salesforceAddressId; 

	public String getSalesforceAddressId() {
		return salesforceAddressId;
	}

	public void setSalesforceAddressId(String salesforceAddressId) {
		this.salesforceAddressId = salesforceAddressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMissingVerification() {
		return missingVerification;
	}

	public void setMissingVerification(String missingVerification) {
		this.missingVerification = missingVerification;
	}

	public String getIsDefaultBilling() {
		return isDefaultBilling;
	}

	public void setIsDefaultBilling(String isDefaultBilling) {
		this.isDefaultBilling = isDefaultBilling;
	}

	public String getIsDefaultShipping() {
		return isDefaultShipping;
	}

	public void setIsDefaultShipping(String isDefaultShipping) {
		this.isDefaultShipping = isDefaultShipping;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Message getMessages() {
		return messages;
	}

	public void setMessages(Message messages) {
		this.messages = messages;
	}

}
