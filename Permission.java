
package com.capgemini.training.customer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Permission {

	@Id
	@GeneratedValue
	private Long permissionId;
	
	@OneToMany
    private List<News> news = null;
	
	@OneToMany
    private List<BackOrder> backOrder = null;
	
	@OneToMany
    private List<Survey> survey = null;
	
	@OneToMany
    private List<None> none = null;

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public List<BackOrder> getBackorder() {
		return backOrder;
	}

	public void setBackorder(List<BackOrder> backOrder) {
		this.backOrder = backOrder;
	}

	public List<Survey> getSurvey() {
		return survey;
	}

	public void setSurvey(List<Survey> survey) {
		this.survey = survey;
	}

	public List<None> getNone() {
		return none;
	}

	public void setNone(List<None> none) {
		this.none = none;
	}

    
   
}
