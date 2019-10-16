package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.ApplicantDAO;
import com.virtusa.entities.Admin;
import com.virtusa.factory.FactoryApplicantDAO;
import com.virtusa.model.AdminModel;

public class ApplicantServiceImpl implements ApplicantService {
	private ApplicantDAO applicantDAO=null;
	public ApplicantServiceImpl(){
		this.applicantDAO=FactoryApplicantDAO.createStudentDAO();
		
	}

	@Override
	public List<AdminModel> retrieveJobService() {
		 List<Admin> jobList=applicantDAO.viewJobs();
		
		List<AdminModel> adminModelList=new ArrayList<AdminModel>();
		
		for(Admin admin:jobList){
			
			AdminModel adminMdl=new AdminModel();
			adminMdl.setJobId(admin.getJob().getJobId());
			adminMdl.setJobTitle(admin.getJob().getJobTitle());
			adminMdl.setJobResponsibilities(admin.getJob().getJobResponsibilities());
			adminMdl.setEligibilityCriteria(admin.getJob().getEligibilityCriteria());
		}
		return adminModelList;
	}

}
