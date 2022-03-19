package com.ynov.medical.patientws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynov.medical.patiensws.model.Patient;
import com.ynov.medical.patientws.dao.PatientDaoImpl;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientDaoImpl myDao;

	@Override
	public Patient createORUpdatePatient(Patient p) {
		// TODO Auto-generated method stub
		return myDao.save(p);

	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return myDao.findAll();
	}

	@Override
	public Patient findPatientById(String id) {
		// TODO Auto-generated method stub
		return myDao.findPatientById(id);
	}

	@Override
	public void deletePatientById(String id) {
		// TODO Auto-generated method stub
		myDao.deleteById(id);

	}

}
