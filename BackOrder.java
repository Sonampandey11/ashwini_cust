package com.capgemini.training.customer.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BackOrder implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long backOrderId;
	
    private String communicationChannel;
    private String permissionCaptureMethod;
    private String sourceSystem;
    private String creationDate;
    private String permissionDate;
    private String permissionStaus;
	public String getCommunicationChannel() {
		return communicationChannel;
	}
	public void setCommunicationChannel(String communicationChannel) {
		this.communicationChannel = communicationChannel;
	}
	public String getPermissionCaptureMethod() {
		return permissionCaptureMethod;
	}
	public void setPermissionCaptureMethod(String permissionCaptureMethod) {
		this.permissionCaptureMethod = permissionCaptureMethod;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getPermissionDate() {
		return permissionDate;
	}
	public void setPermissionDate(String permissionDate) {
		this.permissionDate = permissionDate;
	}
	public String getPermissionStaus() {
		return permissionStaus;
	}
	public void setPermissionStaus(String permissionStaus) {
		this.permissionStaus = permissionStaus;
	}
    
    
    

}
