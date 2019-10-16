package com.virtusa.entities;

public class Job {
	private int JobId;
	private String jobTitle;
	private String jobResponsibilities;
	private String eligibilityCriteria;
	public int getJobId() {
		return JobId;
	}
	@Override
	public String toString() {
		return "Job [JobId=" + JobId + ", jobTitle=" + jobTitle + ", jobResponsibilities=" + jobResponsibilities
				+ ", eligibilityCriteria=" + eligibilityCriteria + ", getJobId()=" + getJobId() + ", getJobTitle()="
				+ getJobTitle() + ", getJobResponsibilities()=" + getJobResponsibilities()
				+ ", getEligibilityCriteria()=" + getEligibilityCriteria() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setJobId(int jobId) {
		JobId = jobId;
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
