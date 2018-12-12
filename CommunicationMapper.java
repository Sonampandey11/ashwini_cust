package com.capgemini.training.mapper;

import org.springframework.stereotype.Component;


@Component
public class CommunicationMapper {
	

	/*public void magentoToCsrMapper(Communication communication)
	{
		// lead id is not present
		ADC_Permission__c permission= new ADC_Permission__c();
		//TODO : Account object to long permission.setAccount__r(communication.getCustomerId());
		permission.setEmail__c(communication.getEmail());
		permission.setCommunication_Type__c(communication.getCommunicationType());
		permission.setCommunication_Channel__c(communication.getCommunicationChannel());
		permission.setSource_System__c(communication.getSourceSystem());
		permission.setCreated_Date_Text__c(communication.getCreationDate().toString());
		permission.setPermission_Capture_Method__c(communication.getPermissionCaptureMethod());
		permission.setPermission_Status__c(communication.getPermissionStatus().toString());
		// TODO : Calendar to  Timestamp permission.setPermission_Date_Time__c(communication.getPermissionDate()));
		permission.setCountry_Code__c(communication.getCountryCode());
		// language code is not present
		
	}
	
	public void CsrToMagentoMapper(ADC_Permission__c permission)
	{
		// lead id is not present
		Communication communication= new Communication();
		//TODO : Account object to long permission.setAccount__r(communication.getCustomerId());
		communication.setEmail(permission.getEmail__c());
		communication.setCommunicationType(permission.getCommunication_Type__c());
		communication.setCommunicationChannel(permission.getCommunication_Channel__c());
		communication.setSourceSystem(permission.getSource_System__c());
	//TODO: conversion	communication.setCreationDate(new Timestamp(Date.valueOf((permission.getCreated_Date_Text__c())));
		communication.setPermissionCaptureMethod(permission.getPermission_Capture_Method__c());
		communication.setPermissionStatus(Long.valueOf(permission.getPermission_Status__c()));
		communication.setCountryCode(permission.getCountry_Code__c());
		// TODO : Calendar to  Timestamp permission.setPermission_Date_Time__c(communication.getPermissionDate()));
		// language code is not present
		
	}*/

}
