package com.demoproject.demoproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paymentdetail")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String cardnumber;
	String cardholder;
	int number;
	int month;
	int year;
	int cvv;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Payment(int id, String cardnumber, String cardholder, int number, int month, int year, int cvv) {
		super();
		this.id = id;
		this.cardnumber = cardnumber;
		this.cardholder = cardholder;
		this.number = number;
		this.month = month;
		this.year = year;
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", cardnumber=" + cardnumber + ", cardholder=" + cardholder + ", number=" + number
				+ ", month=" + month + ", year=" + year + ", cvv=" + cvv + "]";
	}
	public Payment() {
		super();
	}
	}