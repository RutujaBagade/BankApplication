package com.Bank.entities;

import java.util.Scanner;

public class BankAccount {
	static Scanner input = new Scanner(System.in);
	String name, actype;
	int accNo, bal, amt;

	public BankAccount(String name, int accNo, String actype, int bal) {
		this.name = name;
		this.accNo = accNo;
		this.actype = actype;
		this.bal = bal;
	}
	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Account No:" + accNo);
		System.out.println("Balance:" + bal);

	}

	void dbal() {
		System.out.println("Balance:" + bal);
	}
}
