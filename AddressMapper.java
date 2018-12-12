package com.capgemini.training.mapper;

import org.springframework.stereotype.Component;
@Component
public class AddressMapper {
	
	
	
	/*public void cseToMagentoAddressMapper(ADC_Address__c address)
	{
		Address addr=new Address();
		addr.setEntityIds(address.getAddesss_ID__c().longValue());
		addr.setPrefix(address.getAddress_title__c());
		addr.setFirstName(address.getAddress_first_name__c());
		addr.setLastName(address.getAddress_last_name__c());
		addr.setStreet(address.getAddress_street__c());
		addr.setCity(address.getAddress_city__c());
		//Zip code in csr is missing
		addr.setRegion(Date.valueOf(address.getAddress_state__c()));
		addr.setCountryId(address.getAddress_Country__c());
		//Telephone in csr is missing
		addr.setFax(address.getFax__c());
		addr.setVatNumber(address.getVAT_Number__c());
		addr.setCustomerAddressLabel(address.getCustomer_address_label__c());
		//pickpoint terminal id is missing in csr
		addr.setPickpointTerminalName(address.getPickpoint_terminal_Name__c());
		addr.setMissingVerification(address.getMissing_Verification__c().toString());
		addr.setIsDefaultBilling(address.getIs_default_billing__c().toString());
		addr.setIsDefaultShipping(address.getIs_default_shipping__c().toString());
		addr.setCompany(address.getCompany__c());
		
		
	}
	

	public void magentoToCSRAddressMapper(Address addr)
	{
		ADC_Address__c address=new ADC_Address__c();
		address.setAddesss_ID__c(Double.valueOf(addr.getEntityIds()));
		address.setAddress_title__c(addr.getPrefix());
		address.setAddress_first_name__c(addr.getFirstName());
		address.setAddress_last_name__c(addr.getLastName());
		address.setAddress_street__c(addr.getStreet());
		address.setAddress_city__c(addr.getCity());
		//ZipCode in CSR is missing
		address.setAddress_state__c(addr.getRegion().toString());
		address.setAddress_Country__c(addr.getCountryId());
		//Telephone in csr is missing
		address.setFax__c(addr.getFax());
		address.setVAT_Number__c(addr.getVatNumber());
		address.setCustomer_address_label__c(addr.getCustomerAddressLabel());
		//pickpoint terminal iD in csr is missing
		address.setPickpoint_terminal_Name__c(addr.getPickpointTerminalName());
		address.setMissing_Verification__c(Boolean.valueOf(addr.getMissingVerification()));
		address.setIs_default_billing__c(Boolean.valueOf(addr.getIsDefaultBilling()));
        address.setIs_default_shipping__c(Boolean.valueOf(addr.getIsDefaultShipping()));
        address.setCompany__c(addr.getCompany());
		
		
		
		
		
	}*/


}
