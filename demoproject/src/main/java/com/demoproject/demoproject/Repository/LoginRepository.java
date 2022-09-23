package com.demoproject.demoproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoproject.demoproject.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{

}
