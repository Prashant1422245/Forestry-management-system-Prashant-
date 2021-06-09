package com.cg.fms.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.fms.entities.Admin;
@Repository
@Transactional
public interface AdminRepository extends JpaRepository <Admin,Integer> {

	public Admin findByName(String name);
	
	public Long deleteByName(String name);

	

	

	
	
	
	
  
}
