package com.hms.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

	private int patientId;
	private String patientFirstName;
	private String patientLastName;
	private String patientAddress;
	private String patientSymptoms;
	private String patientUnderDoctor;
	private String patientMob;
	
	@Id
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientSymptoms() {
		return patientSymptoms;
	}
	public void setPatientSymptoms(String patientSymptoms) {
		this.patientSymptoms = patientSymptoms;
	}
	public String getPatientUnderDoctor() {
		return patientUnderDoctor;
	}
	public void setPatientUnderDoctor(String patientUnderDoctor) {
		this.patientUnderDoctor = patientUnderDoctor;
	}
	public String getPatientMob() {
		return patientMob;
	}
	public void setPatientMob(String patientMob) {
		this.patientMob = patientMob;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientFirstName=" + patientFirstName + ", patientLastName="
				+ patientLastName + ", patientAddress=" + patientAddress + ", patientSymptoms=" + patientSymptoms
				+ ", patientUnderDoctor=" + patientUnderDoctor + ", patientMob=" + patientMob + "]";
	}
	
	
}
