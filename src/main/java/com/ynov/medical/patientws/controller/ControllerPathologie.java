package com.ynov.medical.patientws.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.medical.patiensws.model.Pathologie;

@RestController
public class ControllerPathologie {

	@GetMapping("/pathologies")
	public List<Pathologie> getPathologies() {
		return null;
	}

}
