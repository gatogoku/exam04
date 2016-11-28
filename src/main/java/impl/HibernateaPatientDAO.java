package impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.PatientDAO;
import model.Patient;
import model.Patient;
import data.HibernateSession;

public class HibernateaPatientDAO implements PatientDAO{

	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void initializaSession(){
		sessionFactory=HibernateSession.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Patient selectById(Long id) {
		
		// TODO Auto-generated method stub
		initializaSession();
		Patient customer = (Patient) session.get(Patient.class, id);
		session.close();
		return customer;
	
	}

	public List<Patient> selectAll() {
		// TODO Auto-generated method stub
		initializaSession();
		List<Patient> roles = session.createCriteria(Patient.class).list();
		session.close();
		return roles;
	}

	public void insert(Patient cg) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		//Long id =  (Long) session.save(role);
		
		session.save(cg);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(Patient cg) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(cg);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Patient cg) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(cg);
		session.getTransaction().commit();
		session.close();
		
	}

}
