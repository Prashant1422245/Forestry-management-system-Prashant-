package com.cg.fms.entities;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="admin_tbl")


public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	
	@NotNull
	@Size(min = 7, message = "Password should have mininum 7 characters!!")
	public String password;
	
	
	@NotNull
	@Size(min = 2, message = "Admin Name should have mininum 2 characters!!")
	public String name;
	
	
	
	
	

}
