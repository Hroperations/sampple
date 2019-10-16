package com.virtusa.service;


import com.virtusa.dao.AdminDAO;
import com.virtusa.entities.Admin;
import com.virtusa.entities.Job;
import com.virtusa.factory.FactoryAdminDAO;
import com.virtusa.model.AdminModel;

public class AdminServiceImpl implements AdminService {

	
		private AdminDAO adminDAO=null;
		public AdminServiceImpl(){
			this.adminDAO=FactoryAdminDAO.createStudentDAO();
			
		}
		
		
		@Override
		public boolean storeJobService(AdminModel adminmodel) {
			// TODO Auto-generated method stub
			
			Admin admin=new Admin();
			
			
			Job job=new Job();
			job.setJobId(adminmodel.getJobId());
			job.setJobTitle(adminmodel.getJobTitle());
			job.setJobResponsibilities(adminmodel.getJobResponsibilities());
			job.setEligibilityCriteria(adminmodel.getEligibilityCriteria());
			
			
			return adminDAO.persistJob(admin);
			
			
	}

}
