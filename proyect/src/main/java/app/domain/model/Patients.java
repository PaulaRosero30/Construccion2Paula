package app.domain.model;

import java.sql.Date;

public class Patients {
	
	
	private String fullName;
	private Date Birthday;
	private String gender;
	private String address;
	private String phoneNumber;
	private String email;
	private long idPatients;
	
	public long getIdPatients() {
		return idPatients;
	}
	public void setIdPatients(long idPatients) {
		this.idPatients = idPatients;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirthday() {
		return Birthday;
	}
	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
};