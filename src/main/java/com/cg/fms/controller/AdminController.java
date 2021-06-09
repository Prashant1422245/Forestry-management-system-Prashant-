package com.cg.fms.controller;

import java.util.List;

import javax.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;

import com.cg.fms.controller.AdminController;
import com.cg.fms.entities.Admin;
import com.cg.fms.service.IAdminService;
import com.cg.fms.service.AdminServiceImpl;
import com.cg.fms.controller.AdminController;


import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/Admin")

public class AdminController {
	
	
	private Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private IAdminService service;
	
	

	
	
	@GetMapping("/getAdmin/{adminName}")
	@ApiOperation("Get Admin By Name")
	public Admin getAdmin(@PathVariable String adminName) {
		logger.info("Inside getAdminName %s", adminName);
		return service.getAdmin(adminName);
	}
	
	@GetMapping("/getAll")
	@ApiOperation("Get All Admin Details")
	public List<Admin> getAllAdmins() {
		logger.info("get all Admin records!!");
		return service.getAllAdmins();
	}
	
	@PostMapping("/save")
	@ApiOperation("Add a Admin Record")
	public boolean save(@Valid @RequestBody Admin admin){
		logger.info("Adding a Admin : " + admin);
		boolean ad = service.addAdmin(admin);
		return service.addAdmin(admin);
		
		
	}
	
	@PutMapping("/update")
	@ApiOperation("Update an Existing Admin Record")
	public boolean update(@Valid @RequestBody Admin admin) {
		logger.info("Updating a admin!!");
		return service.updateAdmin(admin);
	}
	
	@DeleteMapping("/delete/{name}")
	@ApiOperation("Delete an Existing Admin Record")
	public Long delete(@PathVariable String name)  {
		logger.info("Deleting a admin!!");
		return service.deleteAdmin(name);
	}

	}
