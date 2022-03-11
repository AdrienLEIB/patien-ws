package com.ynov.medical.patiensws.model;

import java.util.Date;
import java.util.List;

public class Patient {
	private Integer id;
	private String name;
	public Date dateSupported;
	private List<Pathologie> listPatho;

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
