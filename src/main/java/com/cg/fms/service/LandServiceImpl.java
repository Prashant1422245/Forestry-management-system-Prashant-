package com.cg.fms.service;




import java.util.List;



import com.cg.fms.entities.Admin;
import com.cg.fms.entities.Land;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.service.*;

import com.cg.fms.repository.LandRepository;
import com.cg.fms.controller.LandController;

@Service
public class LandServiceImpl implements ILandService{

Logger logger = LoggerFactory.getLogger(LandServiceImpl.class);
	
    private  Land  land;
	@Autowired
	private LandRepository repository;
        
	@Override
	    public Land getLand(String surveyNumber) {
		logger.info("inside getLand method of LandServiceImpl");
		return repository.findBySurveyNumber(surveyNumber);
	}

	@Override
	public Land addLand(Land land) {
		
	 return repository.save(land);
	}

	@Override
	public Land updateLand(Land land) {
		
		return repository.save(land);
	}

	

	@Override
	public List<Land> getAllLands() {
	
		return repository.findAll();
	}

	@Override
	public Long removeLandDetails(String surveyNumber) {
		return repository.deleteBySurveyNumber(surveyNumber);
		
	}

	
	

	

}
