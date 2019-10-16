package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.model.AdminModel;

public class AdminView {
	public void adminMainView() {
		System.out.println("=======Admin View======");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Post Job");
		System.out.println("2. Generate EmpId and Emp Mail Id");
		System.out.print("Enter option:");
		int option=scanner.nextInt();
		AdminView adminView=new AdminView();
		
		if(option==1){
			adminView.postJob();
			}
		if(option==2){
	         
			
			}
			
			
		}

	private void postJob() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Job Id");
		int jobId=scanner.nextInt();
		
		System.out.print("Enter Job Title");
		String jobTitle=scanner.next();
		
		System.out.print("Enter Job Resposibilities");
		String jobResponsibilities=scanner.next();
		
		System.out.print("Enter eligibility Criteria");
		String eligibilityCriteria=scanner.next();
		System.out.println("\n");
		
		AdminModel adminModel =new AdminModel();
		adminModel.setJobId(jobId);
		adminModel.setJobTitle(jobTitle);
		adminModel.setJobResponsibilities(jobResponsibilities);
		adminModel.setEligibilityCriteria(eligibilityCriteria);
		AdminController adminController=new AdminController();
		adminController.storeJob(adminModel);
		adminMainView();
	
	}
	public void storeSuccessful(){
		
		System.out.println("Job Updated successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Unable to Store");
	}
}
