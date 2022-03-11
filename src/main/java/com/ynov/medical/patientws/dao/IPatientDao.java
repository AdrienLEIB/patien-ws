package com.ynov.medical.patientws.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ynov.medical.patiensws.model.Patient;

@Repository
public interface IPatientDao extends MongoRepository<Patient, Integer> {

}
