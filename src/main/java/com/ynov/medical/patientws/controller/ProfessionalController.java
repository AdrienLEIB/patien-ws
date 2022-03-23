package com.ynov.medical.patientws.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.medical.patiensws.model.Professional;

@RestController
public class ProfessionalController {

	@GetMapping("/professionals")
	public String getAll() throws Exception {
		String uri = "http://127.0.0.1:5000/professionals/";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		return response.body();
	}

	@GetMapping("/professionals/find")
	public String postBody(@RequestBody Professional pro) throws Exception {

		String url = "http://127.0.0.1:5000/professionals/find?speciality=" + pro.speciality + "&latitude="
				+ pro.latitude + "&longitude=" + pro.longitude;

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder() //
				.uri(URI.create(url)) //
				.build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		return response.body();
	}

}
