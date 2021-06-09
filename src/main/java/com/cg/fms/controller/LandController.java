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


import com.cg.fms.entities.Land;
import com.cg.fms.service.ILandService;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/Land")
public class LandController {
	
	private Logger logger = LoggerFactory.getLogger(LandController.class);
	
	@Autowired
	private ILandService service;
    
	@GetMapping("/getLand/{surveyNumber}")
	@ApiOperation("Get Land By surveyNumber")
	public Land getLand(@PathVariable String surveyNumber) {
		logger.info("Inside getLand %s", surveyNumber);
		return service.getLand(surveyNumber);
	}

	@GetMapping("/getAllLands")
	@ApiOperation("Get All Land Details")
	public List<Land> getAllLands() {
		logger.info("get all Land records!!");
		return service.getAllLands();
	}
	@PostMapping("/save")
	@ApiOperation("Add a Land Record")
	public ResponseEntity<Land> save(@Valid @RequestBody Land land) {
		logger.info("Adding a Land : " + land);
		Land lan = service.addLand(land);
		return new ResponseEntity<>(lan, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	@ApiOperation("Update an Existing Land Record")
	public void update(@Valid @RequestBody Land land) {
		logger.info("Updating a Land!!");
		service.updateLand(land);
	}
	
	@DeleteMapping("/delete/{surveyNumber}")
	@ApiOperation("Delete an Existing Land Record")
	public ResponseEntity<Void> delete(@PathVariable String surveyNumber ){
	logger.info("Deleting a Land !!");
	service.removeLandDetails(surveyNumber);
	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	
	}
}
