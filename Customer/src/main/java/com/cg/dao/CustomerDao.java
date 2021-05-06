package com.cg.dao;
/**
-File Name          : CustomerDao
-Author Name        : Capgemini
-Description        : Interface for Customer Repository
-Creation Date		: 12/04/2021
*/

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.entities.Customer;

@Repository("customerdao")
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	
	


}
