package com.virtusa.model;

import java.time.LocalDate;

public class HrModel {
	private int employeeId;
	private int userId;
	private String designation;
	private int deptId;
	private String interviewId;
	private LocalDate interviewDate;
	private String interviewVenue;
	private String resultUpdate;
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getResultUpdate() {
		return resultUpdate;
	}
	public void setResultUpdate(String resultUpdate) {
		this.resultUpdate = resultUpdate;
	}
	public String getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(String interviewId) {
		this.interviewId = interviewId;
	}
	public LocalDate getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(LocalDate interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getInterviewVenue() {
		return interviewVenue;
	}
	public void setInterviewVenue(String interviewVenue) {
		this.interviewVenue = interviewVenue;
	}
	public HrModel() {
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "HrModel [employeeId=" + employeeId + ", userId=" + userId + ", designation=" + designation + ", deptId="
				+ deptId + ", interviewId=" + interviewId + ", interviewDate=" + interviewDate + ", interviewVenue="
				+ interviewVenue + ", resultUpdate=" + resultUpdate + ", userName=" + userName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptId;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((interviewDate == null) ? 0 : interviewDate.hashCode());
		result = prime * result + ((interviewId == null) ? 0 : interviewId.hashCode());
		result = prime * result + ((interviewVenue == null) ? 0 : interviewVenue.hashCode());
		result = prime * result + ((resultUpdate == null) ? 0 : resultUpdate.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HrModel other = (HrModel) obj;
		if (deptId != other.deptId)
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (interviewDate == null) {
			if (other.interviewDate != null)
				return false;
		} else if (!interviewDate.equals(other.interviewDate))
			return false;
		if (interviewId == null) {
			if (other.interviewId != null)
				return false;
		} else if (!interviewId.equals(other.interviewId))
			return false;
		if (interviewVenue == null) {
			if (other.interviewVenue != null)
				return false;
		} else if (!interviewVenue.equals(other.interviewVenue))
			return false;
		if (resultUpdate == null) {
			if (other.resultUpdate != null)
				return false;
		} else if (!resultUpdate.equals(other.resultUpdate))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
}
