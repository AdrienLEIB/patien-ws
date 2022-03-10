package com.ynov.medical.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.medical.model.Patient;

@RestController
public class ControllerPatient {

	@GetMapping("/patiens")
	public List<Patient> getPatient() {

		Patient newPatient = new Patient();
		Date d = new Date();
		newPatient.setId(1);
		newPatient.setName("Debuche");
		newPatient.setDateSupported(d);

		List<Patient> myReturnList = new ArrayList<Patient>();
		myReturnList.add(newPatient);

		return myReturnList;
	}

	public Patient getPatient(Integer id) {
		return null;
	}

	public void setPatient(Patient p) {

	}

	public void deletePatient(Patient p) {

	}

}
