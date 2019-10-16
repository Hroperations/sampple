package com.virtusa.controller;

import java.util.List;

import com.virtusa.factory.FactoryApplicantService;
import com.virtusa.model.AdminModel;
import com.virtusa.service.ApplicantService;
import com.virtusa.view.ApplicantView;



public class ApplicantController {
	private ApplicantService applicantService;
	public ApplicantController(){
		this.applicantService=FactoryApplicantService.createApplicantService();
		
	}

	public void viewJob() {
		List<AdminModel> studentModelList=applicantService.retrieveJobService();
		ApplicantView studentView=new ApplicantView();
		studentView.displayStudentDetails(studentModelList);
		
	}

}
