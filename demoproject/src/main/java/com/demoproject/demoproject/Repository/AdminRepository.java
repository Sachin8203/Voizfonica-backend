package com.demoproject.demoproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoproject.demoproject.entity.Admin;



public interface AdminRepository extends JpaRepository<Admin, Integer> {
	public Admin findByEmail(String email);
	public Admin findByEmailAndPassword(String email,String password);
//	public Admin adminemail(String aemail);
 

}
