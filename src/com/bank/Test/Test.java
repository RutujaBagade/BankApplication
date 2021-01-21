package com.bank.Test;

import java.util.Scanner;

import com.Bank.entities.BankAccount;

public class Test {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Name: ");
		String nn = input.nextLine();
		System.out.println("Enter Account Number: ");
		int num = input.nextInt();
		System.out.println("Enter Account Type: ");
		String type = input.next();
		System.out.println("Enter Initial Balance: ");
		int bal = input.nextInt();
		BankAccount b1 = new BankAccount(nn, num, type, bal);
		int menu;
		System.out.println("Menu");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Information");
		System.out.println("4. Exit");
		boolean quit = false;
		do {
			System.out.print("Please enter your choice: ");
			menu = input.nextInt();
			switch (menu) {
			case 2:
				b1.withdraw();
				break;

		
			}
		} while (!quit);
	}


}
