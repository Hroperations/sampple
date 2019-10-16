package com.virtusa.entities;

public class Applicant extends User {
  
public Applicant() {
		
	}
	private String applicantId;
	public String getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}
	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + "]";
	}
	
}
