package com.ynov.medical.patientws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class PatientWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientWsApplication.class, args);
	}

}
