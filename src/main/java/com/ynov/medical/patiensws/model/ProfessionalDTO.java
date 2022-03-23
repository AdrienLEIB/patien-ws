package com.ynov.medical.patiensws.model;

public class ProfessionalDTO {

	public String id;
	public String name;
	public String speciality;
	public int longitude;
	public int latitude;

	ProfessionalDTO() {

	}

	ProfessionalDTO(String id, String name, String speciality, int longitude, int latitude) {
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		this.longitude = longitude;
		this.latitude = latitude;
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getLongitude() {
		return longitude;
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
