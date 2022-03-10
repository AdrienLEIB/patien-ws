package com.ynov.medical.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.medical.model.Pathologie;

@RestController
public class ControllerPathologie {

	@GetMapping("/pathologies")
	public List<Pathologie> getPathologies() {
		return null;
	}

}
