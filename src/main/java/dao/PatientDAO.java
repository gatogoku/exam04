package dao;

import java.util.List;

import model.Patient;


public interface PatientDAO {
	
	
	public Patient selectById(Long id);

	public List<Patient> selectAll();

	public void insert(Patient cg);

	public void update(Patient cg);

	public void delete(Patient cg);

}
