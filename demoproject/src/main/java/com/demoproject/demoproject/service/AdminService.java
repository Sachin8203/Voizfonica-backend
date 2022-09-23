package com.demoproject.demoproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.demoproject.Repository.AdminRepository;
import com.demoproject.demoproject.entity.Admin;



@Service
public class AdminService {
	@Autowired
	private AdminRepository adm;
	
	public Admin savead(Admin admin) 
	{
		return adm.save(admin);
	}
	public Admin fetchAdminByEmail(String email) 
	{
		return adm.findByEmail(email);
	}
	public Admin fetchAdminByEmailAndPassword(String email,String password) 
	{
		return adm.findByEmailAndPassword(email, password);
	}


}
