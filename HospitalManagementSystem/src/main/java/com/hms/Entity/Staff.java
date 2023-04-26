package com.hms.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	
	private int staffId;
	private String staffFirstName;
	private String staffLastName;
	private String staffProfile;
	private String staffShift;
	private String staffSalary;
	private String staffMob;
	
	@Id
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffFirstName() {
		return staffFirstName;
	}
	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}
	public String getStaffLastName() {
		return staffLastName;
	}
	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}
	public String getStaffProfile() {
		return staffProfile;
	}
	public void setStaffProfile(String staffProfile) {
		this.staffProfile = staffProfile;
	}
	public String getStaffShift() {
		return staffShift;
	}
	public void setStaffShift(String staffShift) {
		this.staffShift = staffShift;
	}
	public String getStaffSalary() {
		return staffSalary;
	}
	public void setStaffSalary(String staffSalary) {
		this.staffSalary = staffSalary;
	}
	public String getStaffMob() {
		return staffMob;
	}
	public void setStaffMob(String staffMob) {
		this.staffMob = staffMob;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffFirstName=" + staffFirstName + ", staffLastName=" + staffLastName
				+ ", staffProfile=" + staffProfile + ", staffShift=" + staffShift + ", staffSalary=" + staffSalary
				+ ", staffMob=" + staffMob + "]";
	}
	
	
}
