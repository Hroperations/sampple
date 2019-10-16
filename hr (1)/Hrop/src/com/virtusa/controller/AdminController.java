package com.virtusa.controller;


import com.virtusa.factory.FactoryAdminService;
import com.virtusa.model.AdminModel;
import com.virtusa.service.AdminService;
import com.virtusa.view.AdminView;

public class AdminController {
	private AdminService adminService;
	public AdminController(){
		this.adminService=FactoryAdminService.createAdminService();
		
	}

	public void storeJob(AdminModel adminModel) {
		boolean result=adminService.storeJobService(adminModel);
		AdminView adminView=new AdminView();
		if(result){
			adminView.storeSuccessful();
		}else{
			
			adminView.storeUnSuccessful();
		}
		
	}



}
