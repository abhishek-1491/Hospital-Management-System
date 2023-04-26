package com.hms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.Entity.Doctor;
import com.hms.Entity.Patient;
import com.hms.Entity.Staff;
import com.hms.Service.HMSService;

@RestController
public class HMSController {

	@Autowired
	HMSService hs;
	
	// 1 API
	
	@GetMapping("/getAllDoctors")
	public List<Doctor> getAllDoctors()
	{
		return hs.getAllDoctors();
	}
	
	// 2 API
	
	@GetMapping("/getAllPatient")
	public List<Patient> getAllPatient()
	{
		return hs.getAllPatient();
	}
	
	// 3 API
	
	@GetMapping("/getAllStaff")
	public List<Staff> getAllStaff()
	{
		return hs.getAllStaff();
	}
	
	// 4 API
	
	@PostMapping("/insertDoctor")
	public String insertDoctor(@RequestBody Doctor doctor)
	{
		return hs.insertDoctor(doctor);
	}
	
	// 5 API
	
	@PostMapping("/insertPatient")
	public String insertPatient(@RequestBody Patient patient)
	{
		return hs.insertPatient(patient);
	}
	
	// 6 API
	
	@PostMapping("/insertStaff")
	public String insertStaff(@RequestBody Staff staff)
	{
		return hs.insertStaff(staff);
	}
	
	// 7 API
	
	@GetMapping("/selectDoctorUsingID/{id}")
	public List<Doctor> selectDoctorUsingID(@PathVariable int id)
	{
		return hs.selectDoctorUsingID(id);
	}
	
	// 8 API
	
	@GetMapping("/selectPatientUsingID/{id}")
	public List<Patient> selectPatientUsingID(@PathVariable int id)
	{
		return hs.selectPatientUsingID(id);
	}
	
	// 9 API
	
	@GetMapping("/selectStaffUsingID/{id}")
	public List<Staff> selectStaffUsingID(@PathVariable int id)
	{
		return hs.selectStaffUsingID(id);
	}
	
	// 10 API
	
	@GetMapping("/getAllPatientUnderGivenDoctor/{name}")
	public List<Patient> getAllPatientUnderGivenDoctor(@PathVariable String name)
	{
		return hs.getAllPatientUnderGivenDoctor(name);
	}
	
	// 11 API
	
	@PutMapping("/updateDoctor")
	public String updateDoctor(@RequestBody Doctor doctor)
	{
		return hs.updateDoctor(doctor);
	}
	
	// 12 API
	
	@PutMapping("/updatePatient")
	public String updatePatient(@RequestBody Patient patient)
	{
		return hs.updatePatient(patient);
	}
	
	// 13 API
	
	@PutMapping("/updateStaff")
	public String updateStaff(@RequestBody Staff staff)
	{
		return hs.updateStaff(staff);
	}
	
	// 14 API

	@GetMapping("/showDoctorsSalaryAbove/{sal}")
	public List<Doctor> showDoctorsSalaryAbove(@PathVariable String sal)
	{
		return hs.showDoctorsSalaryAbove(sal);
	}
	
	// 15 API
	
	@GetMapping("/highestSalaryDoctor")
	public List<Doctor> highestSalaryDoctor()
	{
		return hs.highestSalaryDoctor();
	}
	
	// 16 API
	
	@GetMapping("/nightShiftStaff")
	public List<Staff> nightShiftStaff()
	{
		return hs.nightShiftStaff();
	}
	
	// 17 API
	
	@GetMapping("/morningShiftStaff")
	public List<Staff> morningShiftStaff()
	{
		return hs.morningShiftStaff();
	}
	
	// 18 API
	
	@GetMapping("/afternoonShiftStaff")
	public List<Staff> afternoonShiftStaff()
	{
		return hs.afternoonShiftStaff();
	}
	
	// 19 API
	
	@GetMapping("/nurseStaff")
	public List<Staff> nurseStaff()
	{
		return hs.nurseStaff();
	}
	
	// 20 API
	
	@GetMapping("/receptionistStaff")
	public List<Staff> receptionistStaff()
	{
		return hs.receptionistStaff();
	}
	
	// 21 API
	
	@GetMapping("/wordBoyStaff")
	public List<Staff> wordBoyStaff()
	{
		return hs.wordBoyStaff();
	}
	
	// 22 API
	
	@GetMapping("/getStaffnameStartswithS")
	public List<Staff> getStaffnameStartswithS()
	{
		return hs.getStaffnameStartswithS();
	}
	
	// 23 API
	
	@GetMapping("/doctorsSalaryGreaterThan25k")
	public List<Doctor> doctorsSalaryGreaterThan25k()
	{
		return hs.doctorsSalaryGreaterThan25k();
	}
	
	// 24 API
	
	@GetMapping("/getDoctorsSalLT25k")
	public List<Doctor> getDoctorsSalLT25k()
	{
		return hs.getDoctorsSalLT25k();
	}
	
	// 25 API
	
	@GetMapping("/getDoctorsSalBetween20kTO45K")
	public List<Doctor> getDoctorsSalBetween20kTO45K()
	{
		return hs.getDoctorsSalBetween20kTO45K();
	}
	
	// 26 API
	
	@GetMapping("/doctorsNameStartswithAandSalGT30k")
	public List<Doctor> doctorsNameStartswithAandSalGT30k()
	{
		return hs.doctorsNameStartswithAandSalGT30k();
	}
	
	// 27 API
	
	@GetMapping("/doctorsWithGeneralDepartment")
	public List<Doctor> doctorsWithGeneralDepartment()
	{
		return hs.doctorsWithGeneralDepartment();
	}
	
	// 28 API
	
	@GetMapping("/doctorsAddStartsWithK")
	public List<Doctor> doctorsAddStartsWithK()
	{
		return hs.doctorsAddStartsWithK();
	}
	
	// 29 API
	
	@GetMapping("/staffNameStartsWithS")
	public List<Staff> staffNameStartsWithS()
	{
		return hs.staffNameStartsWithS();
	}
	
	// 30 API 
	
	@GetMapping("/staffSalGT25k")
	public List<Staff> staffSalGT25k()
	{
		return hs.staffSalGT25k();
	}
	
	// 31 API
	
	@GetMapping("/staffSalLT25k")
	public List<Staff> staffSalLT25k()
	{
		return hs.staffSalLT25k();
	}
	
	// 32 API
	
	@GetMapping("/staffNameStartsWithSandSalGT20k")
	public List<Staff> staffNameStartsWithSandSalGT20k()
	{
		return hs.staffNameStartsWithSandSalGT20k();
	}
	
	// 33 API
	
	@GetMapping("/staffLastNameStartWithP")
	public List<Staff> staffLastNameStartWithP()
	{
		return hs.staffLastNameStartWithP();
	}
	
	// 34 API
	
	@GetMapping("/totalNoofDoctors")
	public List<Doctor> totalNoofDoctors()
	{
		return hs.totalNoofDoctors();
	}
	
	// 35 API
	
	@GetMapping("/maxSalDoctor")
	public List<Doctor> maxSalDoctor()
	{
		return hs.maxSalDoctor();
	}
	
	// 36 API
	
	@GetMapping("/minSalDoctor")
	public List<Doctor> minSalDoctor()
	{
		return hs.minSalDoctor();
	}
	
	// 37 API 
	
	@GetMapping("/avgSalDoctor")
	public List<Doctor> avgSalDoctor()
	{
		return hs.avgSalDoctor();
	}
	
	// 38 API
	
	@GetMapping("/maxSalStaff")
	public List<Staff> maxSalStaff()
	{
		return hs.maxSalStaff();
	}
	
	// 39 API
	
	@GetMapping("/minSalStaff")
	public List<Staff> minSalStaff()
	{
		return hs.minSalStaff();
	}
	
	// 40 API
	
	@GetMapping("totalStaff")
	public List<Staff> totalStaff()
	{
		return hs.totalStaff();
	}
}
