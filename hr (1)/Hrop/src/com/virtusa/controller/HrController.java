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
	public void retrieveManager() throws ClassNotFoundException, SQLException {
		HrView hrView=new HrView();
		List<HrModel> hr=hrService.retrieveManager();
	
		hrView.showManager(hr);
		
	}
	public void storeInterviewDetails(HrModel hrModel) throws ClassNotFoundException, SQLException {
		boolean result=hrService.storeInterviewService(hrModel);
		HrView hrView=new HrView();
		if(result){
			hrView.storeSuccessful();
		}else{
			
			hrView.storeUnSuccessful();
		}
		
	}
	public void resultUpdate() throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        HrView hrView=new HrView();
        List<HrModel> hrModelList=hrService.retrieveResultUpdate();
        hrView.displayResultUpdate(hrModelList);
    }
 
}
