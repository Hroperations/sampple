package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Employee;
import com.virtusa.entities.Hr;
import com.virtusa.entities.User;

public interface HrDAO {

	public List<User> assignManager()throws ClassNotFoundException, SQLException;
	public boolean persistInterview(Hr hr) throws ClassNotFoundException,SQLException;
	public List<Hr> viewResultUpdate() throws ClassNotFoundException, SQLException;
}
