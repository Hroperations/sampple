package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Employee;
import com.virtusa.entities.Hr;

public interface HrDAO {

	public List<Employee> getManager(int deptid,String designation)throws ClassNotFoundException, SQLException;
	public boolean persistInterview(Hr hr) throws ClassNotFoundException,SQLException;
}
