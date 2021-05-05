package com.qa.bofa;
import java.util.Scanner;

public class Account {
	int balance;
	String customerName;
	String customerId;
	
	Account(String cName, String cId) {
		customerName = cName;
		customerId = cId;
	}
	
	void accountBalance() {
		System.out.println("Account Balance: " + balance);
		System.out.println();
	}
	
	
	void deposit(int amount) {
		if (amount > 0) { 
			balance = balance + amount;
			System.out.println("You have deposited $" + amount);
			System.out.println("New account balance: $" + balance);
		} else {
			System.out.println("Please enter an amount more than $0");
		}
		
	}
	
	void withdraw(int amount) {
		if (amount > 0) {
			balance = balance - amount;
			System.out.println("You have withdrawn $" + amount);
			System.out.println("New account balance: $" + balance);
			
		} else {
			System.out.println("Please enter an amount more than $0");
		}
		
	}
	
	void menuMessage() {
		System.out.println("Welcome to the Bank of America Account Portal!");
		System.out.println();
		System.out.println("Please Choose an option below to continue: ");
		System.out.println();
		System.out.println("A: View Account Balance.");
		System.out.println();
		System.out.println("B: Make a Deposit.");
		System.out.println();
		System.out.println("C: Make a Withdrawl.");
		System.out.println();
		System.out.println("D: Exit.");
	}
	void customerInfo() {
		System.out.println("Welcome  " + customerName + "! Customer ID: " + customerId);
	}
	
	void initiatePortal() {
		char option = '\0';
		customerInfo();
		menuMessage();
		do {
			@SuppressWarnings("resource")
			Scanner myObject = new Scanner(System.in);
			char chosenOption = myObject.next().charAt(0);
			option = Character.toUpperCase(chosenOption);
			switch (option) {
			case 'A':
				accountBalance();
				menuMessage();
				break;
			case 'B':
				System.out.println("Please Enter an Amount to Deposit: ");
				int depositAmount = myObject.nextInt();
				deposit(depositAmount);
				menuMessage();
				break;
				
			case 'C':
				System.out.println("Please Enter an Amount to Withdraw: ");
				int withdrawlAmount = myObject.nextInt();
				withdraw(withdrawlAmount);
				menuMessage();
				break;
			default:
				System.out.println("Please Choose a valid option: A, B, C, or D.");
				menuMessage();
				break;
			}
					
		} while (option != 'D');
			System.out.println("Thank you for using the Bank of America Account Portal!");
			System.out.println();
			System.out.println("Have a great day " + customerName + "!");
	}
}
