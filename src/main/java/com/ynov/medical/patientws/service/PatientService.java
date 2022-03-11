package com.ynov.medical.patientws.service;

import java.util.List;

import com.ynov.medical.patiensws.model.Patient;

public interface PatientService {

	public Patient createPatient(Patient p);

	public List<Patient> getAllPatients();

	public Patient findPatientById(String id);

	public void deletePatientById(String id);

}
