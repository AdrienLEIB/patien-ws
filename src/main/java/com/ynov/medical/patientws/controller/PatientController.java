package com.ynov.medical.patientws.controller;

import java.net.URI;
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
import com.ynov.medical.patientws.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	public PatientService patientService;

	@GetMapping("/patients")
	public List<Patient> getAll() {
		return patientService.getAllPatients();
	}

	@PostMapping("/patient/add")
	public ResponseEntity<Patient> createPatient(@RequestBody Patient p) {
		Patient patientAdded = patientService.createPatient(p);
		if (Objects.isNull(patientAdded)) {
			return ResponseEntity.noContent().build();
		}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(patientAdded.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("/patients/{id}")
	public Patient getPatientById(@PathVariable String id) {

		return patientService.findPatientById(id);
	}

}
