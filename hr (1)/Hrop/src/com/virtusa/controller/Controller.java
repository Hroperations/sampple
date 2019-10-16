package com.virtusa.controller;

import com.virtusa.factory.UserFactory;
import com.virtusa.model.UserModel;
import com.virtusa.service.UserService;
import com.virtusa.view.AdminView;
import com.virtusa.view.ApplicantView;
import com.virtusa.view.HrView;
import com.virtusa.view.InterviewerView;
import com.virtusa.view.ManagerView;

public class Controller {
	private UserService userService;
	public Controller() {
		this.userService=UserFactory.createUserService();
		
	}
	
	public void userAuthentication(String userName,String password) {
		
		UserModel userModel=new UserModel();
		userModel.setUserName(userName);
		userModel.setPassword(password);
		
		String userType=
				userService.userAuthenticationService(userModel);
		
		if(userType.contentEquals("APPLICANT")) {
			ApplicantView applicant=new ApplicantView();
			applicant.applicantMainView();
		}else if(userType.contentEquals("ADMIN")) {
			AdminView admin=new AdminView();
			admin.adminMainView();
		}else if(userType.contentEquals("HR")) {
			HrView hr=new HrView();
			hr.hrView();
		}else if(userType.contentEquals("INTERVIEWER")) {
			InterviewerView interviewer=new InterviewerView();
			interviewer.interviewerView();
		}else {	
			ManagerView manager=new ManagerView();
			manager.managerView();        
   }
}
}
