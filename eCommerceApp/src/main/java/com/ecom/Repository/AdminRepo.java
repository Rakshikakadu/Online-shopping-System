package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Entity.Admin;


@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{
	
	
	
}
