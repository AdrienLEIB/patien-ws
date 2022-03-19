package com.ynov.medical.patiensws.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patient")
public class Patient {

	@Id
	public String id;
	public String name;
	public String idProfessional;
	// private List<Pathologie> listPatho;

	public String getIdProfessional() {
		return idProfessional;
	}

	public void setIdProfessional(String idProfessional) {
		this.idProfessional = idProfessional;
	}

	public Patient() {

	}

	public Patient(String name) {
		UUID uuid = UUID.randomUUID();
		this.id = uuid.toString();
		this.name = name;

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

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", idProfessional=" + idProfessional + "]";
	}

}
