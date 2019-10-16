package com.virtusa.model;

public class AdminModel {
	private int jobId;
	private String jobTitle;
	private String jobResponsibilities;
	private String eligibilityCriteria;
	@Override
	public String toString() {
		return "AdminModel [jobId=" + jobId + ", jobTitle=" + jobTitle + ", jobResponsibilities=" + jobResponsibilities
				+ ", eligibilityCriteria=" + eligibilityCriteria + ", getJobId()=" + getJobId() + ", getJobTitle()="
				+ getJobTitle() + ", getJobResponsibilities()=" + getJobResponsibilities()
				+ ", getEligibilityCriteria()=" + getEligibilityCriteria() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobResponsibilities() {
		return jobResponsibilities;
	}
	public void setJobResponsibilities(String jobResponsibilities) {
		this.jobResponsibilities = jobResponsibilities;
	}
	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}
	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}
	

}
