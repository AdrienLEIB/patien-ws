package com.ynov.medical.patiensws.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patient")
public class Patient {

	@Id
	public String id;
	public String name;
	public Date dateSupported;
	// private List<Pathologie> listPatho;

	public Patient() {

	}

	public Patient(String id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.dateSupported = date;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", dateSupported=" + dateSupported + "]";
	}

}
