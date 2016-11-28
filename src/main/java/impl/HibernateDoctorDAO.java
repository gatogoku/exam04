package impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import dao.DoctorDAO;
import data.HibernateSession;
import model.Doctor;

public class HibernateDoctorDAO implements DoctorDAO{
	
	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void initializaSession(){
		sessionFactory=HibernateSession.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Doctor selectById(Long id) {
		
		// TODO Auto-generated method stub
		initializaSession();
		Doctor customer = (Doctor) session.get(Doctor.class, id);
		session.close();
		return customer;
	
	}

	public List<Doctor> selectAll() {
		// TODO Auto-generated method stub
		initializaSession();
		List<Doctor> users = session.createCriteria(Doctor.class).list();
		session.close();
		return users;
	}

	public void insert(Doctor user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		Long id =  (Long) session.save(user);
		user.setId(id);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(Doctor user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Doctor user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public List<Doctor> ReturnByName(String name) {
		// TODO Auto-generated method stub
		Criteria criterio ;
		
		//Criterion cr = new Criterion();
		//criterio.add(name);
		initializaSession();
		List<Doctor> users = (List<Doctor>) session.createCriteria(Doctor.class).add(Restrictions.like("name", name)).list();
		session.close();
		return users;
		
	}


}
