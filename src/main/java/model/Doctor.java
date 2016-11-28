package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//@Entity
public class Doctor {
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	Long id;
	String name;
	String area;
	
	//@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,targetEntity=Doctor.class )
	Set <Patient> patients = new HashSet <Patient>();
	
	
	
	public Doctor(){}
	
	
	public Doctor(Long id, String name, String area) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
	}



	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Set<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Set<Patient> doctors) {
		this.patients = doctors;
	}
	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", area=" + area + ", doctors=" + patients + "]";
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String username) {
		this.name = username;
	}
	

}