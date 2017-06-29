package com.microwebservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microwebservice.domain.Account;
import com.microwebservice.domain.AccountRepository;
import com.microwebservice.services.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@RequestMapping("/all")
	public List<Account> getAll() {
		List<Account> accounts = (ArrayList<Account>) accountRepository.findAll();
		return accounts;
	}
	
	@RequestMapping("{id}") 
	public Account getAccount(@PathVariable("id") String id){
		return accountService.getAccount(id);
	}
	
	@RequestMapping(path="/add")
	public @ResponseBody String addNewUser(@RequestParam String number, @RequestParam String name, @RequestParam String type) {
		Account n = new Account();
		n.setAccountName(name);
		n.setAccountType(type);
		n.setAccountNumber(number);
		accountRepository.save(n);
		return "Successfuly saved!!";
	}
}
