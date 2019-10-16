package com.virtusa.factory;

import com.virtusa.service.HrService;
import com.virtusa.service.HrServiceImpl;

public class FactoryHrService {

		public static HrService createHrService(){
			
			HrService hrService=new HrServiceImpl();
				return hrService;
	}

}
