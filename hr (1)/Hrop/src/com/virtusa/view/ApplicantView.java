package com.virtusa.view;

import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.ApplicantController;
import com.virtusa.model.AdminModel;

public class ApplicantView {
	public void applicantMainView() {
		System.out.println("=======Applicant View======");
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Search Job");
		System.out.println("2. Application Status");
		System.out.println("3. Result Updates");
		System.out.println("4. Approve or Reject Offer Letter");
		
		System.out.print("Enter option:");
		int option=scanner.nextInt();
		ApplicantView adminView=new ApplicantView();

		if(option==1){
			ApplicantController applicantController=new ApplicantController();
			applicantController.viewJob();
		}
		if(option==2){
           
		}
		
		
	}
	public void displayStudentDetails(List<AdminModel> adminModel){
    	
		adminModel.forEach(System.out::println);
    }
		
	
}
