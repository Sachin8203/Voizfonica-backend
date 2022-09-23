package com.demoproject.demoproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoproject.demoproject.entity.Register;

public interface RegisterRepository extends JpaRepository<Register, Integer>{
	public Register findById(int id);
	public Register findByEmail(String email);
	public Register findByEmailAndPassword(String email,String password);
//	public Register adminemail(String aemail);

}
