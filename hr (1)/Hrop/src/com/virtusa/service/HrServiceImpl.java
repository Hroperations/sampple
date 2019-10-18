package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.HrDAO;
import com.virtusa.entities.Employee;
import com.virtusa.entities.Hr;
import com.virtusa.entities.Interview;
import com.virtusa.entities.User;
import com.virtusa.factory.FactoryHrDAO;
import com.virtusa.model.HrModel;

public class HrServiceImpl implements HrService {

	private HrDAO hrDAO;
	public HrServiceImpl() {
		this.hrDAO=FactoryHrDAO.createHrDAO();
	}
	  @Override
	    public List<HrModel> retrieveManager() throws ClassNotFoundException, SQLException {
	        User user=new User();
	        List<User> userNameList=hrDAO.assignManager();
	        List<HrModel> userModelList=new ArrayList<HrModel>();
	        for(User user1:userNameList){
	           
	            HrModel userMdl=new HrModel();
	            userMdl.setUserName(user1.getUserName());
	            userModelList.add(userMdl);
	        }
	        return userModelList;
	    }
	public boolean storeInterviewService(HrModel hrModel) throws ClassNotFoundException, SQLException {
		Hr hr=new Hr();
		
		Interview interview=new Interview();
		interview.setInterviewId(hrModel.getInterviewId());
		interview.setInterviewDate(hrModel.getInterviewDate());
		interview.setInterviewVenue(hrModel.getInterviewVenue());
		
		return hrDAO.persistInterview(hr);
	}
	@Override
	public List<HrModel> retrieveResultUpdate() throws ClassNotFoundException, SQLException {

		   List<Hr> resultUpdateStatusList=hrDAO.viewResultUpdate();
	        List<HrModel> hrModelList=new ArrayList<HrModel>();
	        for(Hr hr:resultUpdateStatusList) {
	            HrModel hrMdl=new HrModel();
	            hrMdl.setResultUpdate(hr.getResultUpdate());
	            hrModelList.add(hrMdl);
	        }
	        return hrModelList;
		
	}

}
