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
	 public int deposit() {
		System.out.print("Enter amount to deposit:");
		amt = input.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal + amt;
		return 0;
	}
	
}
