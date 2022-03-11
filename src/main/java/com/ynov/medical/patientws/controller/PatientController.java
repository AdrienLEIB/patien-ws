package com.ynov.medical.patientws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
