package com.sonicloader.rest.domain;

public class StudentRegistration {
	String name;
	int age;
	int registrationNumber;
	String registrationStatus;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
}
