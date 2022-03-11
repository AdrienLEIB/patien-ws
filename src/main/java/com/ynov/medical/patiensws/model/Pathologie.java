package com.ynov.medical.patiensws.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pathologie implements Serializable {

	@Id
	Integer id;
	String nomPatho;
	String severite;

}
