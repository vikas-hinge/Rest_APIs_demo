package com.sid.SurajInformaticsDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	private int id;
	private String name;
	private String qualification;
	private String percentage;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", qualification=" + qualification + ", percentage="
				+ percentage + "]";
	}

}
