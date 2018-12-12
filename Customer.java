package com.capgemini.training.customer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Long id;
	//@JsonProperty(value="country_code")
	private String countryCode;
	//@JsonProperty(value="language_code")
	private String languageCode;
	//@JsonProperty(value="entity_id")
	private  String entityId;
	private  String prefix;
	private String firstname;
	private String lastname;
	private String email;
//	@JsonProperty(value="is_active")
	private String isActive;
	//@JsonProperty(value="group_id")
	private String groupId;
	private  String dob;
	private String customerlandline;
	private  String customermobile;
	//@JsonProperty(value="created_at")
	private String createdAt;
	//@JsonProperty(value="updated_at")
	private String updatedAt;
	//@JsonProperty(value="updated_source")
	private String updatedSource;
	//@JsonProperty(value="fiscal_code")
	private  String fiscalCode;
	//@JsonProperty(value="invited_customer_status")
	private String invitedCustomerStatus;
	//@JsonProperty(value="invited_customer_status_date")
	private String invitedCustomerStatusDate;
	//@JsonProperty(value="payer_institution")
	private String payerInstitution;
	//@JsonProperty(value="ghostAccountId")
	private String ghost_account_id;
	//@JsonProperty(value="insurance_number")
	private String insuranceNumber;
	//@JsonProperty(value="is_off_line")
	private String isOffLine;
	//@JsonProperty(value="terms_and_condition_agreed")
	private String termsAndConditionAgreed;
	//@JsonProperty(value="signature_captured")
	private String signatureCaptured;
	//@JsonProperty(value="data_privacy")
	private String dataPrivacy;
	//@JsonProperty(value="created_from")
	private String createdFrom;
	//@JsonProperty(value="under_18")
	private String under18;
	//@JsonProperty(value="exempted_from_paying_copayment")
	private String exemptedFromPayingCopayment;
	//@JsonProperty(value="prepayment_choice")
	private String prepaymentChoice;
	private String measurement;
	//@JsonProperty(value="samplingProgramCode")
	private String samplingProgramCode;
	//@JsonProperty(value="is_subscribed_for_vat_reduction")
	private String isSubscribedForVatReduction;
	//@JsonProperty(value="vat_reduction_start_date")
	private String vatReductionStartDate;
	//@JsonProperty(value="vat_reduction_end_date")
	private String vatReductionEndDate;
	//@JsonProperty(value="privacy_consent")
	private String privacyConsent;
	//@JsonProperty(value="privacy_survey")
	private String privacySurvey; 
	private String isEmailVerified ;
	private String salesforceCustomerId;
	
	public String getSalesforceCustomerId() {
		return salesforceCustomerId;
	}
	public void setSalesforceCustomerId(String salesforceCustomerId) {
		this.salesforceCustomerId = salesforceCustomerId;
	}
	@OneToOne
	private  Message message;
	@OneToOne
    private Address address;	
	@OneToOne
	private Communication communication;

	public Communication getCommunication() {
		return communication;
	}
	public void setCommunication(Communication communication) {
		this.communication = communication;
	}
	
	public String getIsEmailVerified() {
		return isEmailVerified;
	}
	public void setIsEmailVerified(String isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCustomerlandline() {
		return customerlandline;
	}
	public void setCustomerlandline(String customerlandline) {
		this.customerlandline = customerlandline;
	}
	public String getCustomermobile() {
		return customermobile;
	}
	public void setCustomermobile(String customermobile) {
		this.customermobile = customermobile;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedSource() {
		return updatedSource;
	}
	public void setUpdatedSource(String updatedSource) {
		this.updatedSource = updatedSource;
	}
	public String getFiscalCode() {
		return fiscalCode;
	}
	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}
	public String getInvitedCustomerStatus() {
		return invitedCustomerStatus;
	}
	public void setInvitedCustomerStatus(String invitedCustomerStatus) {
		this.invitedCustomerStatus = invitedCustomerStatus;
	}
	public String getInvitedCustomerStatusDate() {
		return invitedCustomerStatusDate;
	}
	public void setInvitedCustomerStatusDate(String invitedCustomerStatusDate) {
		this.invitedCustomerStatusDate = invitedCustomerStatusDate;
	}
	public String getPayerInstitution() {
		return payerInstitution;
	}
	public void setPayerInstitution(String payerInstitution) {
		this.payerInstitution = payerInstitution;
	}
	public String getGhost_account_id() {
		return ghost_account_id;
	}
	public void setGhost_account_id(String ghost_account_id) {
		this.ghost_account_id = ghost_account_id;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public String getIsOffLine() {
		return isOffLine;
	}
	public void setIsOffLine(String isOffLine) {
		this.isOffLine = isOffLine;
	}
	public String getTermsAndConditionAgreed() {
		return termsAndConditionAgreed;
	}
	public void setTermsAndConditionAgreed(String termsAndConditionAgreed) {
		this.termsAndConditionAgreed = termsAndConditionAgreed;
	}
	public String getSignatureCaptured() {
		return signatureCaptured;
	}
	public void setSignatureCaptured(String signatureCaptured) {
		this.signatureCaptured = signatureCaptured;
	}
	public String getDataPrivacy() {
		return dataPrivacy;
	}
	public void setDataPrivacy(String dataPrivacy) {
		this.dataPrivacy = dataPrivacy;
	}
	public String getCreatedFrom() {
		return createdFrom;
	}
	public void setCreatedFrom(String createdFrom) {
		this.createdFrom = createdFrom;
	}
	public String getUnder18() {
		return under18;
	}
	public void setUnder18(String under18) {
		this.under18 = under18;
	}
	public String getExemptedFromPayingCopayment() {
		return exemptedFromPayingCopayment;
	}
	public void setExemptedFromPayingCopayment(String exemptedFromPayingCopayment) {
		this.exemptedFromPayingCopayment = exemptedFromPayingCopayment;
	}
	public String getPrepaymentChoice() {
		return prepaymentChoice;
	}
	public void setPrepaymentChoice(String prepaymentChoice) {
		this.prepaymentChoice = prepaymentChoice;
	}
	public String getMeasurement() {
		return measurement;
	}
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	public String getSamplingProgramCode() {
		return samplingProgramCode;
	}
	public void setSamplingProgramCode(String samplingProgramCode) {
		this.samplingProgramCode = samplingProgramCode;
	}
	public String getIsSubscribedForVatReduction() {
		return isSubscribedForVatReduction;
	}
	public void setIsSubscribedForVatReduction(String isSubscribedForVatReduction) {
		this.isSubscribedForVatReduction = isSubscribedForVatReduction;
	}
	public String getVatReductionStartDate() {
		return vatReductionStartDate;
	}
	public void setVatReductionStartDate(String vatReductionStartDate) {
		this.vatReductionStartDate = vatReductionStartDate;
	}
	public String getVatReductionEndDate() {
		return vatReductionEndDate;
	}
	public void setVatReductionEndDate(String vatReductionEndDate) {
		this.vatReductionEndDate = vatReductionEndDate;
	}
	public String getPrivacyConsent() {
		return privacyConsent;
	}
	public void setPrivacyConsent(String privacyConsent) {
		this.privacyConsent = privacyConsent;
	}
	public String getPrivacySurvey() {
		return privacySurvey;
	}
	public void setPrivacySurvey(String privacySurvey) {
		this.privacySurvey = privacySurvey;
	}
	


	
	
}
