package com.demoproject.demoproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoproject.demoproject.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
