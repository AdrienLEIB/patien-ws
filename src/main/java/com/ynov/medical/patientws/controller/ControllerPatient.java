package com.ynov.medical.patientws.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ynov.medical.patiensws.model.Patient;
import com.ynov.medical.patientws.dao.IPatientDao;

@RestController
public class ControllerPatient {

	@Autowired
	IPatientDao myDao;

	public static List<Patient> listPatients = new ArrayList<Patient>();

	@GetMapping("/patients")
	public List<Patient> getPatient() {

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
	public ResponseEntity<Patient> addPatientToDatabasee(@RequestBody Patient newPatient) {

		Patient patientAdded = myDao.insert(newPatient);
		// return myDao.save(newPatient)
		if (Objects.isNull(newPatient)) {
			return ResponseEntity.noContent().build();
		}

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id")
				.buildAndExpand(patientAdded.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

	public void setPatient(Patient p) {

	}

	public void deletePatient(Patient p) {

	}

}
