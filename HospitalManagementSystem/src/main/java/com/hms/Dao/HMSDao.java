package com.hms.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.Entity.Doctor;
import com.hms.Entity.Patient;
import com.hms.Entity.Staff;

@Repository
public class HMSDao {

	@Autowired
	private SessionFactory sf;

	// 1 API
	public List<Doctor> getAllDoctors() {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		List<Doctor> list = cr.list();

		return list;

	}

	// 2 API
	public List<Patient> getAllPatient() {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		List<Patient> list = cr.list();

		return list;

	}

	// 3 API
	public List<Staff> getAllStaff() {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		List<Staff> list = cr.list();

		return list;

	}

	// 4 API
	public String insertDoctor(Doctor doctor) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(doctor);
		session.getTransaction().commit();

		return "Doctor inserted Successfully";
	}

	// 5 API
	public String insertPatient(Patient patient) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(patient);
		session.getTransaction().commit();

		return "Patient inserted Successfully";
	}

	// 6 API
	public String insertStaff(Staff staff) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(staff);
		session.getTransaction().commit();

		return "Staff inserted Successfully";
	}

	public List<Doctor> selectDoctorUsingID(int id) {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.eq("doctorId", id));
		List<Doctor> list = cr.list();

		return list;
	}

	public List<Patient> selectPatientUsingID(int id) {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("patientId", id));
		List<Patient> list = cr.list();
		return list;
	}

	public List<Staff> selectStaffUsingID(int id) {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.eq("staffId", id));
		List<Staff> list = cr.list();
		return list;
	}
	
	public List<Patient> getAllPatientUnderGivenDoctor(String name)
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("patientUnderDoctor", name));
		List<Patient> list = cr.list();
		
		return list;
	}
	
	public String updateDoctor(Doctor doctor)
	{
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(doctor);
		session.getTransaction().commit();
		
		return "Doctor updated Successfully";
		
	}

	public String updatePatient(Patient patient) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(patient);
		session.getTransaction().commit();
		
		return "Patient updated Successfully";
	}
	
	public String updateStaff(Staff staff)
	{
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(staff);
		session.getTransaction().commit();
		
		return "Staff updated Successfully";
	}


	public List<Doctor> showDoctorsSalaryAbove(String sal)
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.gt("doctorSalary",sal));
		List<Doctor> list = cr.list();
		
		return list;
	}
	
	public List<Doctor> highestSalaryDoctor()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.setProjection(Projections.max("doctorSalary"));
		List<Doctor> list = cr.list();
		
		return list;
	}
	
	public List<Staff> nightShiftStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.eq("staffShift", "Night Shift"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> morningShiftStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.eq("staffShift", "Morning Shift"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> afternoonShiftStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.eq("staffShift", "Afternoon Shift"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> nurseStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.eq("staffProfile", "Nurse"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> receptionistStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.eq("staffProfile", "Receptionist"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> wordBoyStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.eq("staffProfile", "Word Boy"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> getStaffnameStartswithS()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.like("staffFirstName", "S%"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Doctor> doctorsSalaryGreaterThan25k()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.gt("doctorSalary", "25000"));
		List<Doctor> list = cr.list();
		
		return list;
	}
	
	public List<Doctor> getDoctorsSalLT25k()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.lt("doctorSalary", "25000"));
		List<Doctor> list = cr.list();
		
		return list;
	}
	
	public List<Doctor> getDoctorsSalBetween20kTO45K()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.between("doctorSalary", "20000", "45000"));
		List<Doctor> list = cr.list();
		
		return list;
	}
	
	public List<Doctor> doctorsNameStartswithAandSalGT30k()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.gt("doctorSalary", "30000"));
		cr.add(Restrictions.like("doctorFirstName", "A%"));
		List<Doctor> list = cr.list();
		
		return list;
	}
	public List<Doctor> doctorsWithGeneralDepartment()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.eq("department", "General"));
		List<Doctor> list = cr.list();
		
		return list;
	}
	
	public List<Doctor> doctorsAddStartsWithK()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.like("doctorAddress", "K%"));
		List<Doctor> list = cr.list();
		
		return list;
	}
	
	public List<Staff> staffNameStartsWithS()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.like("staffFirstName", "S%"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> staffSalGT25k()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.gt("staffSalary", "25000"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> staffSalLT25k()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.lt("staffSalary", "25000"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> staffNameStartsWithSandSalGT20k()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.gt("staffSalary", "25000"));
		cr.add(Restrictions.like("staffFirstName", "S%"));
		List<Staff> list = cr.list();
		
		return list;
	}
	
	public List<Staff> staffLastNameStartWithP()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.like("staffLastName", "P%"));
		List<Staff> list = cr.list();
		return list;
	}
	
	public List<Doctor> totalNoofDoctors()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.setProjection(Projections.rowCount());
		List<Doctor> list = cr.list();
		return list;
	}
	public List<Doctor> maxSalDoctor()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.setProjection(Projections.max("doctorSalary"));
		List<Doctor> list = cr.list();
		return list;
		
	}
	
	public List<Doctor> minSalDoctor()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.setProjection(Projections.min("doctorSalary"));
		List<Doctor> list = cr.list();
		return list;
		
	}
	
	public List<Doctor> avgSalDoctor()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.setProjection(Projections.avg("doctorSalary"));
		List<Doctor> list = cr.list();
		return list;
	}
	
	public List<Staff> maxSalStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.setProjection(Projections.max("staffSalary"));
		List<Staff> list = cr.list();
		return list;
	}
	
	public List<Staff> minSalStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.setProjection(Projections.min("staffSalary"));
		List<Staff> list = cr.list();
		return list;
	}
	
	public List<Staff> totalStaff()
	{
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.setProjection(Projections.rowCount());
		List<Staff> list = cr.list();
		return list;
	}


}
