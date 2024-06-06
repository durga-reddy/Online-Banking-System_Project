
package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
	@Id
	private int accountNum;
	private String name;
	private String password;
	private double amount;
	private String address;
	private String mobile;
	private int status;
	
	
	public Bank() {
		super();
	}


	public Bank(int accountNum, String name, String password, double amount, String address, String mobile,
			int status) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobile = mobile;
		this.status = status;
	}


	public int getAccountNum() {
		return accountNum;
	}


	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Bank [accountNum=" + accountNum + ", name=" + name + ", password=" + password + ", amount=" + amount
				+ ", address=" + address + ", mobile=" + mobile + ", status=" + status + "]";
	}
	
	
	
	
	
	
}
