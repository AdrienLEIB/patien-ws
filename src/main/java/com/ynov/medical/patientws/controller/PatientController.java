package com.ynov.medical.patientws.controller;

import java.net.URI;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
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
	public ResponseEntity<Patient> createPatient(@RequestBody Patient p) throws Exception {

		Patient patient = patientService.createORUpdatePatient(p);
		if (patient.idProfessional != null) {
			String url = "http://127.0.0.1:5000/professionals/add/" + patient.idProfessional;

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

			MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
			map.add("patient", patient.id);

			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map,
					headers);
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

		}

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
