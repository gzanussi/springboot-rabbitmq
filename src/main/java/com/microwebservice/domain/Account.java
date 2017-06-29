package com.microwebservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
   
	private String name;
	
	@Column(unique = true)
	private String number;
	
	private String type;
    private double balance;
	private String status;
	
	
	public Account() {
		this.status = "inactive";
		this.balance = 0.00;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountName() {
		return name;
	}
	public void setAccountName(String accountName) {
		this.name = accountName;
	}
	public String getAccountType() {
		return type;
	}
	public void setAccountType(String accountType) {
		this.type = accountType;
	}
	public String getAccountNumber() {
		return number;
	}
	public void setAccountNumber(String accountNumber) {
		this.number = accountNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
