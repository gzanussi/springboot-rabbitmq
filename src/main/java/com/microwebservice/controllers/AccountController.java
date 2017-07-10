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
		if(accounts == null) {
		}
		return accounts;
	}
	
	@RequestMapping("{id}")
	public Account getAccount(@PathVariable("id") String id){
		Account response  = accountService.getAccount(id);
//		if(response == null) throw new AccountNotFoundException();
		return response;
	}
	
	@RequestMapping(path="/add")
	public @ResponseBody String addNewUser(@RequestParam String number, @RequestParam String name, @RequestParam String type) {
		Account account = new Account();
		account.setAccountName(name);
		account.setAccountType(type);
		account.setAccountNumber(number);
		accountRepository.save(account);
		return "Successfuly saved!!";
	}
	
//	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Account")  // 404
//	 public class AccountNotFoundException extends RuntimeException {
//	    
//	 }
}
