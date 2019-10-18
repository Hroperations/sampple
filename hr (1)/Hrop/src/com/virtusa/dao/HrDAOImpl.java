package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Employee;
import com.virtusa.entities.Hr;
import com.virtusa.entities.Interview;
import com.virtusa.entities.User;
import com.virtusa.integrate.ConnectionManager;

public class HrDAOImpl implements HrDAO {

	   User user=new User();
	@Override
	public List<User> assignManager() throws ClassNotFoundException, SQLException {

			     Connection connection=ConnectionManager.openConnection();
          PreparedStatement statement=connection.prepareStatement("select u.userName from users u join employee e on u.userId=e.userId and  designation='Manager'");
		            ResultSet resultSet=statement.executeQuery();
		            List<User> userList=new ArrayList<>();
		            while(resultSet.next()) {
		               
		                user.setUserName(resultSet.getString("userName"));
		                userList.add(user);
		            }   
		                  ConnectionManager.closeConnection();
		                 
		                return userList;
		
	}

	@Override
	public boolean persistInterview(Hr hr) throws ClassNotFoundException, SQLException {
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("insert into interview values(?,?,?)");
		Interview interview=new Interview();
		statement.setString(1, interview.getInterviewId());
	    System.out.println(statement);
	    LocalDate localDate=interview.getInterviewDate();
		java.sql.Date interviewDate=new java.sql.Date(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
		statement.setDate(2,interviewDate);
	    
		statement.setString(3,interview.getInterviewVenue());
		System.out.println(statement);
		int rows=statement.executeUpdate();
		if(rows>0)
			return true;
		else
	
		return false;
	}

	@Override
	public List<Hr> viewResultUpdate() throws ClassNotFoundException, SQLException {
        Connection connection=null;
        connection = ConnectionManager.openConnection();
        PreparedStatement statement=
                connection.prepareStatement("select resultUpdate from applicant");
        ResultSet resultSet=
                statement.executeQuery();
        List<Hr>    resultUpdateList=new ArrayList<Hr>();
        while(resultSet.next()) {
            Hr hr=new Hr();
            hr.setResultUpdate(resultSet.getString(1));
            resultUpdateList.add(hr);
        }
    return resultUpdateList;
	}



}
