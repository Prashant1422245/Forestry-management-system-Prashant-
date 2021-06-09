package com.cg.fms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fms.entities.Land;
@Service
public interface ILandService {
   public Land getLand(String surveyNumber);

	public Land addLand(Land land);

	public Land updateLand(Land land);
    
	public List<Land> getAllLands();



	public Long removeLandDetails(String surveyNumber);
}
