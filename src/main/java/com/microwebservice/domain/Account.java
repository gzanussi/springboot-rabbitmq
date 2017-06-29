package com.microwebservice.domain;

import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class Account {
	double balance;
	String name;
	String number;
	String type;
	String status;
	
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
}
