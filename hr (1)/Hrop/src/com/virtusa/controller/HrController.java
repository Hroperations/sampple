package com.virtusa.controller;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.factory.FactoryHrService;
import com.virtusa.model.HrModel;
import com.virtusa.service.HrService;
import com.virtusa.view.EmployeeView;
import com.virtusa.view.HrView;

public class HrController {
	private HrService hrService;
	EmployeeView employeeView=new EmployeeView();
	
	public HrController() {
		this.hrService=
				FactoryHrService.createHrService();
	}
	public void retrieveManager(int deptId, String designation) throws ClassNotFoundException, SQLException {
		List<HrModel> hr=hrService.retrieveManager(deptId,designation);
	
		employeeView.showManager(hr);
		
	}
	public void storeInterviewDetails(HrModel hrModel) throws ClassNotFoundException, SQLException {
		boolean result=HrService.storeInterviewService(hrModel);
		HrView hrView=new HrView();
		if(result){
			hrView.storeSuccessful();
		}else{
			
			hrView.storeUnSuccessful();
		}
		
	}
}
