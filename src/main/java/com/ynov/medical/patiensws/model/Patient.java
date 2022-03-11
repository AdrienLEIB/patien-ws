package com.ynov.medical.patiensws.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patient")
public class Patient {

	@Id
	private Integer id;
	private String name;
	public Date dateSupported;
	private List<Pathologie> listPatho;

	public Patient() {

	}

	public Patient(Integer id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.dateSupported = date;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateSupported() {
		return dateSupported;
	}

	public void setDateSupported(Date dateSupported) {
		this.dateSupported = dateSupported;
	}

	public List<Pathologie> getListPatho() {
		return listPatho;
	}

	public void setListPatho(List<Pathologie> listPatho) {
		this.listPatho = listPatho;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", dateSupported=" + dateSupported + ", listPatho=" + listPatho
				+ "]";
	}

}
