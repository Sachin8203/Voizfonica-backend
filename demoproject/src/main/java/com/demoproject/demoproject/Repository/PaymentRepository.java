package com.demoproject.demoproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoproject.demoproject.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}