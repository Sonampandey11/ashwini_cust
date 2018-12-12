package com.capgemini.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.customer.entity.Address;
import com.capgemini.training.customer.entity.Communication;
import com.capgemini.training.customer.entity.Customer;
import com.capgemini.training.repository.AddressRepository;
import com.capgemini.training.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AddressRepository addressRepository;

	@Transactional
	public Customer save(Customer cust) {

		customerRepository.save(cust);
		return cust;
	}

	@Transactional
	public void delete(Long id) {
		customerRepository.deleteById(id);
	}

	@Transactional
	public Customer update(String id, Customer customers) {

		Customer cust = customerRepository.findById(19L).get();
		cust.setEntityId(id);
		customerRepository.save(cust);
		Customer customerList = customerRepository.findByEntityId(id).get(0);
		if (customers.getEmail() != null)
			customerList.setEmail(customers.getEmail());
		if (customers.getCustomerlandline() != null)
			customerList.setCustomerlandline(customers.getCustomerlandline());
		if (customers.getCustomermobile() != null)
			customerList.setCustomermobile(customers.getCustomermobile());
		if (customers.getDataPrivacy() != null)
			customerList.setDataPrivacy(customers.getDataPrivacy());
		if (customers.getDob() != null)
			customerList.setDob(customers.getDob());
		if (customers.getFirstname() != null)
			customerList.setFirstname(customers.getFirstname());
		if (customers.getLastname() != null)
			customerList.setLastname(customers.getLastname());
		if (customers.getCountryCode() != null)
			customerList.setCountryCode(customers.getCountryCode());
		if (customers.getLanguageCode() != null)
			customerList.setLanguageCode(customers.getLanguageCode());
		if (customers.getPrefix() != null)
			customerList.setPrefix(customers.getPrefix());
		if (customers.getIsActive() != null)
			customerList.setIsActive(customers.getIsActive());
		if (customers.getGroupId() != null)
			customerList.setGroupId(customers.getGroupId());
		if (customers.getUpdatedSource() != null)
			customerList.setUpdatedSource(customers.getUpdatedSource());
		if (customers.getFiscalCode() != null)
			customerList.setFiscalCode(customers.getFiscalCode());
		if (customers.getInsuranceNumber() != null)
			customerList.setInsuranceNumber(customers.getInsuranceNumber());
		if (customers.getInvitedCustomerStatus() != null)
			customerList.setInvitedCustomerStatus(customers.getInvitedCustomerStatus());
		if (customers.getInvitedCustomerStatusDate() != null)
			customerList.setInvitedCustomerStatusDate(customers.getInvitedCustomerStatusDate());
		if (customers.getPayerInstitution() != null)
			customerList.setPayerInstitution(customers.getPayerInstitution());
		if (customers.getGhost_account_id() != null)
			customerList.setGhost_account_id(customers.getGhost_account_id());
		if (customers.getIsOffLine() != null)
			customerList.setIsOffLine(customers.getIsOffLine());
		if (customers.getTermsAndConditionAgreed() != null)
			customerList.setTermsAndConditionAgreed(customers.getTermsAndConditionAgreed());
		if (customers.getSignatureCaptured() != null)
			customerList.setSignatureCaptured(customers.getSignatureCaptured());
		if (customers.getDataPrivacy() != null)
			customerList.setDataPrivacy(customers.getDataPrivacy());
		if (customers.getCreatedFrom() != null)
			customerList.setCreatedFrom(customers.getCreatedFrom());
		if (customers.getUnder18() != null)
			customerList.setUnder18(customers.getUnder18());
		if (customers.getExemptedFromPayingCopayment() != null)
			customerList.setExemptedFromPayingCopayment(customers.getExemptedFromPayingCopayment());
		if (customers.getPrepaymentChoice() != null)
			customerList.setPrepaymentChoice(customers.getPrepaymentChoice());
		if (customers.getMeasurement() != null)
			customerList.setMeasurement(customers.getMeasurement());
		if (customers.getSamplingProgramCode() != null)
			customerList.setSamplingProgramCode(customers.getSamplingProgramCode());
		if (customers.getIsSubscribedForVatReduction() != null)
			customerList.setIsSubscribedForVatReduction(customers.getIsSubscribedForVatReduction());
		if (customers.getVatReductionEndDate() != null)
			customerList.setVatReductionEndDate(customers.getVatReductionEndDate());
		if (customers.getVatReductionStartDate() != null)
			customerList.setVatReductionStartDate(customers.getVatReductionStartDate());
		if (customers.getPrivacyConsent() != null)
			customerList.setPrivacyConsent(customers.getPrivacyConsent());
		if (customers.getPrivacySurvey() != null)
			customerList.setPrivacySurvey(customers.getPrivacySurvey());
		if (customers.getIsEmailVerified() != null)
			customerList.setIsEmailVerified(customers.getIsEmailVerified());
		if (customers.getSalesforceCustomerId() != null)
			customerList.setSalesforceCustomerId(customers.getSalesforceCustomerId());
		return customerList;
	}

	public List<Customer> getAllCustomer() {
		List<Customer> customer = new ArrayList<>();
		for (Customer cust : customerRepository.findAll()) {
			customer.add(cust);
		}
		return customer;
	}

	public Customer getCustomer(String id, Customer customer) {
		Customer customer1 = customerRepository.findById(18L).get();
		customer1.setEntityId(id);
		customerRepository.save(customer1);
		return customerRepository.findByEntityId(id).get(0);
	}

	public Address getCustomerAddress(Long id) {
		return customerRepository.findById(id).get().getAddress();
	}

	public void updateAddress(Long id) {
		Optional<Address> addressList = addressRepository.findById(id);

		Address address = null;
		if (addressList.isPresent()) {
			address = addressList.get();
			address.setFirstname("Sakshi");
		}
		addressRepository.save(address);

	}

	public Address getCustomerAdressById(String Cid, String Aid) {
		Address addr = null;
		Customer cust = customerRepository.findById(18L).get();
		cust.setEntityId(Cid);
		customerRepository.save(cust);
		Customer custom = customerRepository.findByEntityId(Cid).get(0);
		Address cAddress = addressRepository.findById(16L).get();
		cAddress.setEntityId(Aid);
		addressRepository.save(cAddress);
		List<Address> list = new ArrayList<>();
		list.add(cAddress);
		cust.setAddress(cAddress);
		customerRepository.save(custom);
		Address addressList = custom.getAddress();
		Address address = addressRepository.findByEntityId(Aid).get(0);

		if (addressList.equals(address)) {
			addr = addressList;
		}

		return addr;
	}

	public Address updateAddressById(Address addrss, String cId, String aId) {
		Customer cust = customerRepository.findById(19L).get();
		cust.setEntityId(cId);
		customerRepository.save(cust);
		Customer custom = customerRepository.findByEntityId(cId).get(0);
		Address cAddress = addressRepository.findById(17L).get();
		cAddress.setEntityId(aId);
		cAddress.setSalesforceAddressId(addrss.getSalesforceAddressId());
		addressRepository.save(cAddress);
		List<Address> list = new ArrayList<>();
		list.add(cAddress);
		cust.setAddress(cAddress);
		customerRepository.save(custom);
		Address addressList = custom.getAddress();
		Address address = addressRepository.findByEntityId(aId).get(0);

		if (address.equals(addressList)) {
			if (addrss.getFirstname() != null)
				address.setFirstname(addrss.getFirstname());
			if (addrss.getCity() != null)
				address.setCity(addrss.getCity());
			if (addrss.getCountryId() != null)
				address.setCountryId(addrss.getCountryId());
			if (addrss.getCustomerId() != null)
				address.setCustomerId(addrss.getCustomerId());
			if (addrss.getEntityId() != null)
				address.setEntityId(addrss.getEntityId());
			if (addrss.getId() != null)
				address.setId(addrss.getId());
			if (addrss.getIsDefaultBilling() != null)
				address.setIsDefaultBilling(addrss.getIsDefaultBilling());
			if (addrss.getIsDefaultShipping() != null)
				address.setIsDefaultShipping(addrss.getIsDefaultShipping());
			if (addrss.getLastname() != null)
				address.setLastname(addrss.getLastname());
			if (addrss.getMessages() != null)
				address.setMessages(addrss.getMessages());
			if (addrss.getMissingVerification() != null)
				address.setMissingVerification(addrss.getMissingVerification());
			if (addrss.getPostcode() != null)
				address.setPostcode(addrss.getPostcode());
			if (addrss.getPrefix() != null)
				address.setPrefix(addrss.getPrefix());
			if (addrss.getStreet() != null)
				address.setStreet(addrss.getStreet());
			if (addrss.getTelephone() != null)
				address.setTelephone(addrss.getTelephone());
			if (addrss.getSalesforceAddressId() != null)
				address.setSalesforceAddressId(addrss.getSalesforceAddressId());
			List<Address> list1 = new ArrayList<>();
			list1.add(address);
			cust.setAddress(address);

		}
		return address;
	}

	public Address createcustomerAddress(String customerId, Address address, Customer cust) {
		cust.setEntityId(customerId);
		customerRepository.save(cust);
		Customer customer = customerRepository.findByEntityId(customerId).get(0);
		List<Address> list = new ArrayList<>();
		list.add(address);
		customer.setAddress(address);
		addressRepository.save(customer.getAddress());
		customerRepository.save(customer);
		return customer.getAddress();
	}

	public Communication getCustomerCommunication(String customerId) {
		Customer customer1 = customerRepository.findById(19L).get();
		customer1.setEntityId(customerId);
		customerRepository.save(customer1);
		Customer customer = customerRepository.findByEntityId(customerId).get(0);
		return customer.getCommunication();
	}

}
