package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Bank;
import com.web.service.BankServiceImp;


@Controller
public class BankController {
	@Autowired
	private BankServiceImp service;

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	
	@RequestMapping("/account")
	public String bankForm() {
		return "account";
	}
	@RequestMapping("/register")
	public String saveForm(Bank bank, ModelMap model ) {
		Bank s=service.saveBank(bank);
		model.put("dur", s);
		if(s!=null) {
			return "success";
		}
		else
			return "insufficent";
	}
	
	
	
	
	@RequestMapping("/balance")
	public String balanceForm() {
		
		return "balance";
	}
	@RequestMapping("/bal")
	public String balanceForm(@RequestParam int accountNum, @RequestParam String name, @RequestParam String password ,ModelMap model ) {
		if(service.check(accountNum, name, password)) {
			model.put("dur", accountNum);
			return "accountclose";
		}
		Bank bank=service.getBank(accountNum,name, password);
		model.put("dur", bank);
		
		if(bank!=null) {
			return "bankdetails";
		}
		else
			return "invalid";
	}
	
	
	
	
	
	@RequestMapping("/deposit")
	public String depositForm() {
		
		return "deposit";
	}
	@RequestMapping("/dep")
	public String depositForm(@RequestParam int accountNum, @RequestParam String name, @RequestParam String password,@RequestParam double amount, ModelMap model ) {
		if(service.check(accountNum, name, password)) {
			model.put("dur", accountNum);
			return "accountclose";
		}
		Bank bank=service.depositeBank(accountNum,name, password,amount);
		model.put("dur", bank);
	
		if(bank!=null) {
			return "bankdetails";
		}
		else
			return "invalid";
	}
	
	
	
	
	@RequestMapping("/withdraw")
	public String withdrawForm() {
		
		return "withdraw";
	}
	@RequestMapping("/wit")
	public String withdrawForm(@RequestParam int accountNum, @RequestParam String name, @RequestParam String password,@RequestParam double amount, ModelMap model ) {
		if(service.check(accountNum, name, password)) {
			model.put("dur", accountNum);
			return "accountclose";
		}
		Bank bank=service.withdraw(accountNum,name, password,amount);
		model.put("dur", bank);
		
		if(bank!=null) {
			return "bankdetails";
		}
		else
			return "insufficent";
	}
	
	
	
	
	@RequestMapping("/transfer")
	public String transferForm() {
		
		return "transfer";
	}
	@RequestMapping("/tra")
	public String transferForm(@RequestParam int accountNum, @RequestParam String name, @RequestParam String password,@RequestParam int taccountNum,@RequestParam double amount, ModelMap model ) {
		if(service.check(accountNum, name, password)) {
			model.put("dur", accountNum);
			return "accountclose";
		}
		Bank bank=service.transfer(accountNum,name, password,taccountNum,amount);
		model.put("dur", bank);
		if(bank!=null) {
			return "bankdetails";
		}
		else
			return "insufficent";
	}
	
	
	
	
	
	@RequestMapping("/close")
	public String closeForm() {
		return "close";
	}
	@RequestMapping("/clo")
	public String closeForm(@RequestParam int accountNum, @RequestParam String name, @RequestParam String password, ModelMap model ) {
		Bank bank=service.close(accountNum,name,password);
		model.put("dur", bank);
		if(bank!=null) {
			return "accountclose";
		}
		else
			return "invalid";	
	}
	
	
	
	

	
	
}
