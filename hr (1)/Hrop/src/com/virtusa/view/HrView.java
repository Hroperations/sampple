package com.virtusa.view;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.virtusa.controller.HrController;
import com.virtusa.model.HrModel;

public class HrView {
	public void hrView() throws ClassNotFoundException,SQLException {
		System.out.println("=======Hr View======");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.View Application");
		System.out.println("2.Send Application Status");
		System.out.println("3.Assign Manager");
		System.out.println("4.Send Interview Details To Applicant");
		System.out.println("5.Send Result Update");
		System.out.println("6. Generate Offer Letter");
		System.out.print("Enter option:");
		
		int option=scanner.nextInt();
		HrView hrView=new HrView();
		if(option==1)
		  hrView.viewApplication();
		else if(option==2)
			hrView.sendApplicationStatus();
		else if(option==3)
			hrView.assignManager();
		else if(option==4)
			hrView.sendInterviewDetailsToApplicant();
		else if(option==5)
			hrView.sendResultUpdate();
		else
			hrView.generateOfferLetter();
		
	}

	private void generateOfferLetter() {
		// TODO Auto-generated method stub
		
	}

	private void sendResultUpdate() {
		// TODO Auto-generated method stub
		
	}

	private void sendInterviewDetailsToApplicant() throws ClassNotFoundException, SQLException {
        
     Scanner scanner=new Scanner(System.in);
		System.out.println("Enter interview id");
		String interviewId=scanner.next();
		System.out.println("Enter interview date");
		String interviewDateString=scanner.next();
		StringTokenizer tokens=new StringTokenizer(interviewDateString,"/");
		
		List<String> tokensList=new ArrayList<>();
		while(tokens.hasMoreTokens()) {
			tokensList.add(tokens.nextToken());
		}
		
		int dayOfMonth=Integer.parseInt(tokensList.get(0));
		int month=Integer.parseInt(tokensList.get(1));
		int year=Integer.parseInt(tokensList.get(2));
		
		LocalDate interviewDate=LocalDate.of(year, month-1, dayOfMonth);
		System.out.println("Enter interview venue");
		String interviewVenue=scanner.next();
		
		HrModel hrModel=new HrModel();
		hrModel.setInterviewId(interviewId);
		hrModel.setInterviewDate(interviewDate);
		hrModel.setInterviewVenue(interviewVenue);
		
		HrController hrController=new HrController();
		hrController.storeInterviewDetails(hrModel);
		hrView();
		
	}

	private void assignManager() {
		HrController hrController=new HrController();
		  
		  try(Scanner scanner=new Scanner(System.in);){
			  System.out.println("Please Enter Department Id:");
			  int deptId=scanner.nextInt();
			  System.out.println("Please Enter Designation:");
			  String designation=scanner.next();
		      hrController.retrieveManager(deptId,designation);
			  
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	       
		
	}

	private void sendApplicationStatus() {
		// TODO Auto-generated method stub
		HrController hrController=new HrController();
		
	}

	private void viewApplication() {
		// TODO Auto-generated method stub
		
	}
public void storeSuccessful(){
		
		System.out.println("Details Updated successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Unable to Store");
	}
}
