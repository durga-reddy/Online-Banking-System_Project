package com.web.service;

import com.web.model.Bank;

public interface BankService {
	public Bank saveBank(Bank bank);
	public Bank depositeBank(int accountNum , String name, String password, double amount);
	public Bank getBank(int accountNum , String name, String password);
	public Bank withdraw(int accountNum , String name, String password, double amount);
	public Bank transfer(int accountNum,String name,String password,int taccountNum,double amount);
	public Bank close(int accountNum , String name, String password);
	public boolean check(int accountNum, String name, String password);
	
	

}
