package com.hms.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.Dao.HMSDao;
import com.hms.Entity.Doctor;
import com.hms.Entity.Patient;
import com.hms.Entity.Staff;

@Service
public class HMSService {

	@Autowired
	private HMSDao hd;

	public List<Doctor> getAllDoctors() {

		return hd.getAllDoctors();
	}

	public List<Patient> getAllPatient() {

		return hd.getAllPatient();
	}
	
	public List<Staff> getAllStaff() {
		return hd.getAllStaff();
	}

	public String insertDoctor(Doctor doctor) {
		return hd.insertDoctor(doctor);
	}
	
	public String insertPatient(Patient patient)
	{
		return hd.insertPatient(patient);
	}
	
	public String insertStaff(Staff staff)
	{
		return hd.insertStaff(staff);
	}

	public List<Doctor> selectDoctorUsingID(int id) {
		
		return hd.selectDoctorUsingID(id);
		
	}

	public List<Patient> selectPatientUsingID(int id) {
		return hd.selectPatientUsingID(id);
	}
	
	public List<Staff> selectStaffUsingID(int id)
	{
		return hd.selectStaffUsingID(id);
	}
	
	
	public List<Patient> getAllPatientUnderGivenDoctor(String name)
	{
		return hd.getAllPatientUnderGivenDoctor(name);
	}
	
	public String updateDoctor(Doctor doctor)
	{
		return hd.updateDoctor(doctor);
	}

	public String updatePatient(Patient patient) {
		return hd.updatePatient(patient);
	}
	
	public String updateStaff(Staff staff)
	{
		return hd.updateStaff(staff);
	}
	

	public List<Doctor> showDoctorsSalaryAbove(String sal)
	{
		return hd.showDoctorsSalaryAbove(sal);
	}

	public List<Doctor> highestSalaryDoctor()
	{
		return hd.highestSalaryDoctor();
	}
	public List<Staff> nightShiftStaff()
	{
		return hd.nightShiftStaff();
	}
	public List<Staff> morningShiftStaff()
	{
		return hd.morningShiftStaff();
	}
	public List<Staff> afternoonShiftStaff()
	{
		return hd.afternoonShiftStaff();
	}
	public List<Staff> nurseStaff()
	{
		return hd.nurseStaff();
	}
	public List<Staff> receptionistStaff()
	{
		return hd.receptionistStaff();
	}
	public List<Staff> wordBoyStaff()
	{
		return hd.wordBoyStaff();
	}
	public List<Staff> getStaffnameStartswithS()
	{
		return hd.getStaffnameStartswithS();
	}
	public List<Doctor> doctorsSalaryGreaterThan25k()
	{
		return hd.doctorsSalaryGreaterThan25k();
	}
	public List<Doctor> getDoctorsSalLT25k()
	{
		return hd.getDoctorsSalLT25k();
	}
	public List<Doctor> getDoctorsSalBetween20kTO45K()
	{
		return hd.getDoctorsSalBetween20kTO45K();
	}
	public List<Doctor> doctorsNameStartswithAandSalGT30k()
	{
		return hd.doctorsNameStartswithAandSalGT30k();
	}
	public List<Doctor> doctorsWithGeneralDepartment()
	{
		return hd.doctorsWithGeneralDepartment();
	}
	public List<Doctor> doctorsAddStartsWithK()
	{
		return hd.doctorsAddStartsWithK();
	}
	public List<Staff> staffNameStartsWithS()
	{
		return hd.staffNameStartsWithS();
	}
	public List<Staff> staffSalGT25k()
	{
		return hd.staffSalGT25k();
	}
	public List<Staff> staffSalLT25k()
	{
		return hd.staffSalLT25k();
	}
	public List<Staff> staffNameStartsWithSandSalGT20k()
	{
		return hd.staffNameStartsWithSandSalGT20k();
	}
	public List<Staff> staffLastNameStartWithP()
	{
		return hd.staffLastNameStartWithP();
	}
	public List<Doctor> totalNoofDoctors()
	{
		return hd.totalNoofDoctors();
	}
	public List<Doctor> maxSalDoctor()
	{
		return hd.maxSalDoctor();
	}
	public List<Doctor> minSalDoctor()
	{
		return hd.minSalDoctor();
	}
	public List<Doctor> avgSalDoctor()
	{
		return hd.avgSalDoctor();
	}
	public List<Staff> maxSalStaff()
	{
		return hd.maxSalStaff();
	}
	public List<Staff> minSalStaff()
	{
		return hd.minSalStaff();
	}
	public List<Staff> totalStaff()
	{
		return hd.totalStaff();
	}
}
