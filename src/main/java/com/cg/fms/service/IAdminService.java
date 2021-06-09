package com.cg.fms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fms.entities.Admin;
@Service
public interface IAdminService {

	public Admin getAdmin(String adminName);

	public boolean addAdmin(Admin admin);
	
	public boolean updateAdmin(Admin admin);

	public Long deleteAdmin(String name);

	public List<Admin> getAllAdmins();

	
	
}
