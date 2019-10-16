package com.virtusa.view;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.model.HrModel;

public class EmployeeView {
	
	private HrView hrview=new HrView();

	public void showManager(List<HrModel> hr) throws ClassNotFoundException, SQLException {
		for(HrModel model:hr) {
	     System.out.println(model.getEmployeeId()+"  "+model.getDesignation());
		}
	
		hrview.hrView();
	}

}
