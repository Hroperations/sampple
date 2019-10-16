package com.virtusa.entities;

import java.time.LocalDate;

public class Interview {

	private String interviewId;
	private LocalDate interviewDate;
	private String interviewVenue;
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
	@Override
	public String toString() {
		return "Interview [interviewId=" + interviewId + ", interviewDate=" + interviewDate + ", interviewVenue="
				+ interviewVenue + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((interviewDate == null) ? 0 : interviewDate.hashCode());
		result = prime * result + ((interviewId == null) ? 0 : interviewId.hashCode());
		result = prime * result + ((interviewVenue == null) ? 0 : interviewVenue.hashCode());
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
		Interview other = (Interview) obj;
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
		return true;
	}
	
	
}
