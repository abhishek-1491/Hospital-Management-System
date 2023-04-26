package com.hms.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {

	
	private int doctorId;
	private String doctorFirstName;
	private String doctorLastName;
	private String department;
	private String doctorAddress;
	private String doctorMob;
	private String doctorSalary;
	
	@Id
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorFirstName() {
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDoctorAddress() {
		return doctorAddress;
	}
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	public String getDoctorMob() {
		return doctorMob;
	}
	public void setDoctorMob(String doctorMob) {
		this.doctorMob = doctorMob;
	}
	public String getDoctorSalary() {
		return doctorSalary;
	}
	public void setDoctorSalary(String doctorSalary) {
		this.doctorSalary = doctorSalary;
	}
	@Override
	public String toString() {
		return "Staff [doctorId=" + doctorId + ", doctorFirstName=" + doctorFirstName + ", doctorLastName="
				+ doctorLastName + ", department=" + department + ", doctorAddress=" + doctorAddress + ", doctorMob="
				+ doctorMob + ", doctorSalary=" + doctorSalary + "]";
	}
	
	


}
