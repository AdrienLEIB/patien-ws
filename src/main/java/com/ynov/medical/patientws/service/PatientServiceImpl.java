package com.ynov.medical.patientws.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ynov.medical.patiensws.model.Patient;
import com.ynov.medical.patientws.dao.IPatientDao;

public class PatientServiceImpl implements PatientService {

	@Autowired
	IPatientDao myDao;

	@Override
	public Patient createPatient(Patient p) {
		// TODO Auto-generated method stub
		return myDao.save(p);

	}

	@Override
	public Collection<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return myDao.findAll();
	}

	@Override
	public Optional<Patient> findPatientById(Integer id) {
		// TODO Auto-generated method stub
		return myDao.findById(id);
	}

	@Override
	public void deletePatientById(Integer id) {
		// TODO Auto-generated method stub
		myDao.deleteById(id);

	}

}
