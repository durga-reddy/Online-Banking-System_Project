package com.web.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Bank;

import com.web.repo.BankRepo;

@Service
public class BankServiceImp implements BankService{
	@Autowired
	private BankRepo repo;
	
	public Bank saveBank(Bank bank) {
		 Bank save = null;
		if(bank.getAmount()>=1000) {
			save=repo.save(bank);	
		}
		return save;
	}

	@Override
	public Bank getBank(int accountNum , String name, String password) {
		boolean ban=repo.existsById(accountNum) ;
		if(ban) {
			Bank bank= repo.findById(accountNum).get();
					if(bank.getName().equals(name)&& bank.getPassword().equals(password)) {
						bank.setStatus(0);
						Bank save=repo.save(bank);
						
						return bank;
					}
					else
					{
						return null;
					}
		}
		else
		{
			return null;
		}
	}
	
	@Override
	public Bank depositeBank(int accountNum , String name, String password, double amount) {
		boolean ban=repo.existsById(accountNum) ;
		if(ban) {
			Bank bank= repo.findById(accountNum).get();
			if(bank.getName().equals(name)&& bank.getPassword().equals(password)) {
				amount = (bank.getAmount()+amount);
				bank.setAmount(amount);
				Bank save=repo.save(bank);
				return bank;
			}
			else
			{
				return null;
			}
			
		}
		else
		{
			return null;
		}

	}
	@Override
	public Bank withdraw(int accountNum,String name,String password,double amount) {
		boolean ban=repo.existsById(accountNum) ;
		if(ban) {
			Bank bank= repo.findById(accountNum).get();
			if(bank.getName().equals(name)&& bank.getPassword().equals(password)) {
				if(bank.getAmount()>=amount) {
				amount = (bank.getAmount()-amount);
				bank.setAmount(amount);
				Bank save=repo.save(bank);
				return bank;
				}
				else {
					return null;
				}
				
				
			}
			else
			{
				return null;
			}
			
		}
		else
		{
			return null;
		}

	}

	
	
	
	@Override
	public Bank transfer(int accountNum,String name,String password,int taccountNum,double amount) {
		boolean ban=repo.existsById(accountNum) ;
		boolean ban1=repo.existsById(taccountNum);
		
		if(ban && ban1) {
			Bank bank= repo.findById(accountNum).get();
			if(bank.getName().equals(name)&& bank.getPassword().equals(password)) {
				
				Double amt=amount;
				amount = (bank.getAmount()-amount);
				bank.setAmount(amount);
				Bank save=repo.save(bank);
				Bank bank1= repo.findById(taccountNum).get();	
				amount = (bank1.getAmount()+ amt);
				bank1.setAmount(amount);
				Bank save1=repo.save(bank1);
				
				return bank1;
			}
			else
			{
				return null;
			}
			
		}
		
		else
		{
			return null;
		}

	}
	
	
	
	
	@Override
	public Bank close(int accountNum, String name, String password) {
		
		boolean ban=repo.existsById(accountNum) ;
		if(ban) {
			Bank bank= repo.findById(accountNum).get();
					if(bank.getName().equals(name)&& bank.getPassword().equals(password)) {
						bank.setStatus(1);
						repo.save(bank);
						return bank;
					}
					else
					{
						return null;
					}
		}
		else
		{
			return null;
		}
	}
	
	
	
	@Override
	public boolean check(int accountNum, String name, String password) {
		boolean ch=repo.existsById(accountNum) ;
		if(ch) {
			Bank bank=repo.findById(accountNum).get();
			if(bank.getName().equals(name)&& bank.getPassword().equals(password)) {
				int s= bank.getStatus();
				if(s==1) {
					return true;
				}
				else {
					return false;
					
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	}
	

