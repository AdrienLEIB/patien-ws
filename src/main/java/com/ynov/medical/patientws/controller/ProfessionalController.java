package com.ynov.medical.patientws.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ynov.medical.patiensws.model.Professional;

@RestController
public class ProfessionalController {

	@GetMapping("/professionals")
	public String getAll() throws Exception {
		String uri = "http://127.0.0.1:5000/professionals/";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());

		return response.body();
	}

	@GetMapping("/professionals/find")
	public List<Professional> postBody(@RequestBody Professional pro) {

		String url = "http://127.0.0.1:5000/professionals/find";
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();

		// can set the content Type
		headers.setContentType(MediaType.APPLICATION_JSON);

		headers.add("speciality", pro.speciality);

		HttpEntity<String> httpEntity = new HttpEntity<>("some body", headers);

		return (List<Professional>) restTemplate.postForObject(url, httpEntity, Professional.class);
	}

}
