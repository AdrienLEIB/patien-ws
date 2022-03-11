package com.ynov.medical.patiensws.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient implements Serializable {

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

}
