package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


//@Entity
public class Patient {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String sex;
	
	//@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,targetEntity=Doctor.class )
	Set <Doctor> doctors = new HashSet <Doctor>();
	

	
	public Patient(){}
	
	public Patient(String name, String sex){
		this.name=name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name ;
	}
	public Long getId() {
		return id;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Set<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	
	



}
