package com.ynov.medical.patiensws.model;

import org.springframework.data.annotation.Id;

public class Professional {

	@Id
	public String id;
	public String name;
	public String speciality;
	public int longitude;
	public int latitude;

	// public List<Patient> patiens;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLongitude() {
		return longitude;
	}

	@Override
	public String toString() {
		return "Professional [id=" + id + ", name=" + name + ", speciality=" + speciality + ", longitude=" + longitude
				+ ", latitude=" + latitude + "]";
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

}
