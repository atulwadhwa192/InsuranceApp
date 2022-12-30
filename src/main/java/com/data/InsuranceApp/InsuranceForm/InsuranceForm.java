package com.data.InsuranceApp.InsuranceForm;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class InsuranceForm {
	private static int count;
	private String firstName;
	private String lastName;
	private Date dob;
	private String emailId;
	private String mobileNo;
	private String gender;
	private String tobacoo;
	private int income;
	private int LifeCoverAmount;
	private int LifeCoverAge;
	private String status;
	public int policyId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTobacoo() {
		return tobacoo;
	}
	public void setTobacoo(String tobacoo) {
		this.tobacoo = tobacoo;
	}
	public int getLifeCoverAmount() {
		return LifeCoverAmount;
	}
	public void setLifeCoverAmount(int lifeCoverAmount) {
		LifeCoverAmount = lifeCoverAmount;
	}
	public int getLifeCoverAge() {
		return LifeCoverAge;
	}
	public void setLifeCoverAge(int lifeCoverAge) {
		LifeCoverAge = lifeCoverAge;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCount() {
		return count;
	}
	public void updateCount() {
		count++;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	
	
	
	
	

}
