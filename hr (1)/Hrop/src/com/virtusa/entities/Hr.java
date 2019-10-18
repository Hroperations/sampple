package com.virtusa.entities;

public class Hr extends User {
  
public Hr() {
		
	}
	private String hrId;
	private String resultUpdate;
	public String getHrId() {
		return hrId;
	}
	public void setHrId(String hrId) {
		this.hrId = hrId;
	}
	@Override
	public String toString() {
		return "Hr [hrId=" + hrId + ", resultUpdate=" + resultUpdate + "]";
	}
	public String getResultUpdate() {
		return resultUpdate;
	}
	public void setResultUpdate(String resultUpdate) {
		this.resultUpdate = resultUpdate;
	}
	
	
}
