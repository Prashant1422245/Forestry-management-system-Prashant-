package com.cg.fms.repository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entities.Admin;
import com.cg.fms.entities.Land;
@Repository
@Transactional
public interface LandRepository extends JpaRepository<Land, Integer> {
	
	
	
	public Long deleteBySurveyNumber(String surveyNumber);

	public Land findBySurveyNumber(String surveyNumber);
	
}
