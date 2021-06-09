package com.cg.fms.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.service.*;
import com.cg.fms.entities.Admin;
import com.cg.fms.repository.AdminRepository;
import com.cg.fms.controller.AdminController;

@Service
public class AdminServiceImpl implements IAdminService {
   
	Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);
	
    private  Admin  admin;
	@Autowired
	private AdminRepository repository;
	
	@Override
	public Admin getAdmin(String name) {
		logger.info("inside getAdmin method of AdminServiceImpl");
		return repository.findByName(name);
		
	}

	@Override
	public boolean addAdmin(Admin admin) {
		Admin adm= repository.save(admin);
		return true;
		
	}

	@Override
	public boolean updateAdmin(Admin admin) {
	 
		Admin adm = repository.save(admin);
		return true;
	
	}


	@Override
	public List<Admin> getAllAdmins() {
		
		return repository.findAll();
	}

	@Override
	public Long deleteAdmin(String name) {
		
		return repository.deleteByName(name);
	}

	

	
}
