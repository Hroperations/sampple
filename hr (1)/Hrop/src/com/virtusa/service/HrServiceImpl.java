package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.HrDAO;
import com.virtusa.entities.Employee;
import com.virtusa.entities.Hr;
import com.virtusa.entities.Interview;
import com.virtusa.factory.FactoryHrDAO;
import com.virtusa.model.HrModel;

public class HrServiceImpl implements HrService {

	private HrDAO hrDAO;
	public HrServiceImpl() {
		this.hrDAO=FactoryHrDAO.createHrDAO();
	}
	@Override
	public List<HrModel> retrieveManager(int deptId,String designation) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		List<HrModel> hrModelList=new ArrayList<>();
		try {
			List<Employee> employeeList=hrDAO.getManager(deptId, designation);
			for(Employee employee:employeeList) {
			
				HrModel hrModel=new HrModel();
				hrModel.setEmployeeId(employee.getEmployeeId());
				hrModel.setDesignation(employee.getDesignation());
				hrModelList.add(hrModel);
				
			}
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return hrModelList;
	}
	public boolean storeInterviewService(HrModel hrModel) throws ClassNotFoundException, SQLException {
		Hr hr=new Hr();
		
		Interview interview=new Interview();
		interview.setInterviewId(hrModel.getInterviewId());
		interview.setInterviewDate(hrModel.getInterviewDate());
		interview.setInterviewVenue(hrModel.getInterviewVenue());
		
		return hrDAO.persistInterview(hr);
	}

}
