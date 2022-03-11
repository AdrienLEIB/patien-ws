package com.ynov.medical.patientws.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.medical.patiensws.model.Patient;
import com.ynov.medical.patientws.dao.IPatientDao;

@RestController
public class ControllerPatient {

	@Autowired
	IPatientDao myDao;

	public static List<Patient> listPatients = new ArrayList<Patient>();
	static {
		Patient patient1 = new Patient(1, "adrien", new Date());
		Patient patient2 = new Patient(2, "hugo", new Date());
		Patient patient3 = new Patient(3, "maxou", new Date());
		Patient patient4 = new Patient(4, "antoine", new Date());
		listPatients.add(patient1);
		listPatients.add(patient2);
		listPatients.add(patient3);
		listPatients.add(patient4);
	}

	@GetMapping("/patients")
	public List<Patient> getPatient() {
		/*
		 * Patient newPatient = new Patient(); Date d = new Date(); newPatient.setId(0);
		 * newPatient.setName("Debuche"); newPatient.setDateSupported(d);
		 * 
		 * 
		 * listPatients.add(newPatient);
		 */
		return listPatients;
	}

	@GetMapping("/patients/{id}")
	public Patient getPatient(@PathVariable Integer id) {

		for (Patient patient : ControllerPatient.listPatients) {
			if (patient.getId() == id) {
				return patient;
			}
		}
		// Patient p = listPatients.get(id);
		return null;
	}

	@PostMapping("/patients/add")
	public Patient addPatientToDatabasee(@RequestBody Patient newPatient) {

		return myDao.save(newPatient);

	}

	public void setPatient(Patient p) {

	}

	public void deletePatient(Patient p) {

	}

}
