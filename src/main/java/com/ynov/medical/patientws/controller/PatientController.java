package com.ynov.medical.patientws.controller;

import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/patients/add")
	public ResponseEntity<Patient> createPatient(@RequestBody Patient p) {

		p.id = UUID.randomUUID().toString();
		Patient patient = patientService.createORUpdatePatient(p);
		if (Objects.isNull(patient)) {
			return ResponseEntity.noContent().build();
		}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(patient.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("/patients/{id}")
	public Patient getPatientById(@PathVariable String id) {

		return patientService.findPatientById(id);
	}

}
