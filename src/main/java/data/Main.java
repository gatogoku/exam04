package data;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dao.PatientDAO;
import impl.HibernateaPatientDAO;

import impl.HibernateDoctorDAO;
import model.Patient;

import model.Doctor;

public class Main {

	public static void main(String[] args) {
	
		
		HibernateaPatientDAO hfd = new HibernateaPatientDAO();
		
		HibernateDoctorDAO hpd = new HibernateDoctorDAO();
		

		
		Patient f1 = new Patient("patient1","MALE");
		Patient f2 = new Patient("patient2","FEMALE");
		Patient f3 = new Patient("patient3","MALE");
		Patient f4 = new Patient("patient4","FEMALE");
		Patient f5 = new Patient("patient5","MALE");
		Patient f6 = new Patient("patient6","FEMALE");
		Patient f7 = new Patient("patient7","MALE");
		Patient f8 = new Patient("patient8","FEMALE");
		
		
		Doctor p1 = new Doctor(10L,"doctor1","1/2/1888");
		Doctor p2 = new Doctor(11L,"doctor2","1/2/1888");
		Doctor p3 = new Doctor(12L,"doctor3","1/2/1888");
		
		
		hpd.ReturnByName("doctor");
		
	
		Set <Doctor> psf1 = new HashSet<Doctor>();
	psf1.add(p1); psf1.add(p2); psf1.add(p3);
	
f1.setDoctors(psf1);

Set <Patient> ptm1 = new HashSet<Patient>();
ptm1.add(f5); ptm1.add(f6); ptm1.add(f3);

p3.setPatients(ptm1);

hpd.insert(p2);



//hfd.insert(f1);
//hfd.insert(f2);


//hfd.selectAll();
		
		
		
//		
//
	}

}
