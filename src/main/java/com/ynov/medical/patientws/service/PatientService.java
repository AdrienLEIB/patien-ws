package com.ynov.medical.patientws.service;

import java.util.Collection;
import java.util.Optional;

import com.ynov.medical.patiensws.model.Patient;

public interface PatientService {

	public Patient createPatient(Patient p);

	public Collection<Patient> getAllPatients();

	public Optional<Patient> findPatientById(Integer id);

	public void deletePatientById(Integer id);

}
