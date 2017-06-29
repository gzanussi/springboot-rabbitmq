package com.microwebservice.services;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.microwebservice.domain.Account;

@Service
public class AccountService {
	Hashtable<String, Account> accounts = new Hashtable<String, Account>();
	
	public AccountService() {
		Account account = new Account();
		account.setAccountName("fhfhghghghg");
		account.setAccountName("rerere");
		account.setBalance(23434.22);
		accounts.put("1", account);
	}
	
	public Account getAccount(String id) {
		if(accounts.contains(id)) {
			return accounts.get(id);
		}
		return null;
	}

	public Hashtable<String, Account> getAll() {
		return accounts;
	}

}
