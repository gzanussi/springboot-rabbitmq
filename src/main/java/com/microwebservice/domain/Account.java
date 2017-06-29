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
    private double balance = 0.00;
	private String name;
	private String number;
	private String type;
	private String status = "active";
	
	public Account() {
		status = "inactive";
		balance = 0.00;
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
