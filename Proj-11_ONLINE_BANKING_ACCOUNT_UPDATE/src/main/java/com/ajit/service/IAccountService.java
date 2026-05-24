package com.ajit.service;

import com.ajit.entity.Account;

public interface IAccountService {

	String openAccount(Account account);
	String depositeMoney(int acno, double amount);
	String withdrawMoney(int acno, double amount);
	String transferMoney(int srcAcc, int destAcc, double amount);
}