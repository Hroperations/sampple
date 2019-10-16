package com.virtusa.factory;

import com.virtusa.dao.HrDAO;
import com.virtusa.dao.HrDAOImpl;

public class FactoryHrDAO {

	public static HrDAO createHrDAO(){
		HrDAO hrDAO=new HrDAOImpl();
		return hrDAO;
		
	}
}
