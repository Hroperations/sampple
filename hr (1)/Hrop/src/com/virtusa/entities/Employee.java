package com.virtusa.entities;

public class Employee {

	private int employeeId;
	private int userId;
	private String designation;
	private int deptId;
	public int getEmployeeId() {
		return employeeId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + deptId;
		result = prime * result + employeeId;
		result = prime * result + userId;
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
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (deptId != other.deptId)
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", userId=" + userId + ", Designation=" + designation
				+ ", deptId=" + deptId + ", getEmployeeId()=" + getEmployeeId() + ", getUserId()=" + getUserId()
				+ ", getDesignation()=" + getDesignation() + ", getDeptId()=" + getDeptId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
		designation = designation;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
}
