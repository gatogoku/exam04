package dao;

import java.util.List;

import model.Doctor;


public interface DoctorDAO {

	
	public Doctor selectById(Long id);

	public List<Doctor> selectAll();

	public void insert(Doctor user);

	public void update(Doctor user);

	public void delete(Doctor user);
	

}
