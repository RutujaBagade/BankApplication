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
		
		
		
		 public int withdraw() {
			System.out.println("Your Balance=" + bal);
			System.out.print("Enter amount to withdraw:");
			amt = input.nextInt();
			if (bal < amt) {
				System.out.println("Not sufficient balance.");
				return 1;
			}
			if (amt < 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			bal = bal - amt;
			return 0;
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
