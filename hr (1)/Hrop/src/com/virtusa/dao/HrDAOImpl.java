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
import com.virtusa.integrate.ConnectionManager;

public class HrDAOImpl implements HrDAO {

	@Override
	public List<Employee> getManager(int deptid,String designation) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("select employeeid,designation\r\n"+
				"from employee\r\n"+
				"where deptid=? and designation=?;"
				);
		statement.setInt(1, deptid);
		statement.setString(2, designation);
		ResultSet resultSet=statement.executeQuery();
		List<Employee> employeeList=new ArrayList<Employee>();
		while(resultSet.next()) {
			Employee employee=new Employee();
			employee.setEmployeeId(resultSet.getInt("employeeId"));
			employee.setDesignation(resultSet.getString("designation"));
			employeeList.add(employee);
		}
		ConnectionManager.closeConnection();
		return employeeList;
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

}
