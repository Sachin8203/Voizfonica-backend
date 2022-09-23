package com.demoproject.demoproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.demoproject.Repository.RegisterRepository;
import com.demoproject.demoproject.entity.Register;

@Service
public class RegisterService {
	@Autowired
	private RegisterRepository rep;
	
	public Register saveReg(Register register) 
	{
		return rep.save(register);
	}
	public Register fetchRegisterByEmail(String email) 
	{
		return rep.findByEmail(email);
	}
	public Register fetchRegisterByEmailAndPassword(String email,String password) 
	{
		return rep.findByEmailAndPassword(email, password);
	}
//	public Register adminreg(String aemail,String password) {
//		return rep.adminemail(aemail="admin@voizfonica.com");
//		
//	}
	
	

}
