package com.ynov.medical.patientws.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ynov.medical.patiensws.model.Professional;

@RestController
public class ProfessionalController {

	@GetMapping("/professionals")
	public List<Professional> getAll() {
		final String uri = "http://127.0.0.1:5000/professionals";

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);

		System.out.println(result);

		return null;
	}

}
