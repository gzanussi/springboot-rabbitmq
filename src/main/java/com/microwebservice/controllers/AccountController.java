package com.microwebservice.controllers;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microwebservice.domain.Account;
import com.microwebservice.services.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/all")
	public Hashtable<String, Account> getAll() {
		return accountService.getAll();
	}
	
	@RequestMapping("{id}") 
	public Account getAccount(@PathVariable("id") String id){
		return accountService.getAccount(id);
	}
}
