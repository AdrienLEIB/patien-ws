package com.ynov.medical.patientws.dao;

import java.util.List;

import com.ynov.medical.patiensws.model.Patient;

public interface IPatientDao {

	public List<Patient> findPatient();

	public Patient findPatientById(Integer id);

}
