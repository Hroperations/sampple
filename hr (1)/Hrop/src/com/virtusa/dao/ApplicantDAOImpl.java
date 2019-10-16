package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.Admin;
import com.virtusa.repository.AdminRepository;

public class ApplicantDAOImpl implements ApplicantDAO {

	@Override
	public List<Admin> viewJobs() {
		return AdminRepository.get();
	}

}
