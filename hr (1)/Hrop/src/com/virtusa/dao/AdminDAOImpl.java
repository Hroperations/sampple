package com.virtusa.dao;

import com.virtusa.entities.Admin;
import com.virtusa.repository.AdminRepository;

public class AdminDAOImpl implements AdminDAO {
	@Override
	public boolean persistJob(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepository.add(admin);
	}

	

}
