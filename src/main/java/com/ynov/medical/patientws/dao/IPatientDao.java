package com.ynov.medical.patientws.dao;

import java.net.UnknownHostException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynov.medical.patiensws.model.Patient;

public interface IPatientDao extends JpaRepository<Patient, Integer> {

	public List<Patient> findPatient() throws UnknownHostException;

	public Patient findPatientById(Integer id);

	public boolean savePatient(Patient p);

}
