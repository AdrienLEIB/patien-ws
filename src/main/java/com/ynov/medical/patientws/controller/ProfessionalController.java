package com.ynov.medical.patientws.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ynov.medical.patiensws.model.Professional;

@RestController
public class ProfessionalController {

	public RestTemplate restTemplate;

	@RequestMapping("/professionals")
	public String getAll() {
		String uri = "http://127.0.0.1:5000/professionals";

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();
	}

	@GetMapping("/professionals/find")
	public List<Professional> postBody(@RequestBody Professional pro) {

		String url = "http://127.0.0.1:5000/professionals/find";

		HttpHeaders headers = new HttpHeaders();

		// can set the content Type
		headers.setContentType(MediaType.APPLICATION_JSON);

		headers.add("speciality", pro.speciality);

		HttpEntity<String> httpEntity = new HttpEntity<>("some body", headers);

		return (List<Professional>) restTemplate.postForObject(url, httpEntity, Professional.class);
	}

}
