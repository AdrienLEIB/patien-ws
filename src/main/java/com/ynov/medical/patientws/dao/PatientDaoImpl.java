package com.ynov.medical.patientws.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ynov.medical.patiensws.model.Patient;

public interface PatientDaoImpl extends MongoRepository<Patient, String> {

	Patient findPatientById(String id);

}
