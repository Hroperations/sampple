package com.virtusa.service;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.model.HrModel;

public interface HrService {

	public List<HrModel> retrieveManager(int deptId,String designation) throws ClassNotFoundException,SQLException;

	public boolean storeInterviewService(HrModel hrModel) throws ClassNotFoundException, SQLException;

}
