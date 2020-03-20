package Project2;

import java.util.*;

/*	Project 4
 * @author Donald Mears
 * 
 * Program Description: BankAccount class to build BankAccount objects
 * 
 * 
 */

public class BankAccount {
		
		//declare private variables
		private String acctHolderFirstName;
		private String acctHolderLastName;
		private double chkBalance;
		private double saveBalance;
		private String acctType;
		private double acctBalance;
		private long pin;
		private long encryptedPin;
	
		
		//default constructor
		public BankAccount() {
			chkBalance = 0;
			saveBalance = 0;
			acctBalance = 0;
			acctType = "Checking";
			getAccountInfo();				
		}
		
		//second constructor
		public BankAccount(String firstName, String lastName, double balance, String type) {
			acctHolderFirstName = firstName;
			acctHolderLastName = lastName;
			acctBalance = balance;
			acctType = type;
		}
		
		public BankAccount(double checking, double savings) {
			chkBalance = checking;
			saveBalance = savings;
			setAccountPassword();
		}
		//Get account info method to obtain account information from user
		public void getAccountInfo() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Whats your first name?");
			acctHolderFirstName = scan.nextLine();
			System.out.println("Whats your last name?");
			acctHolderLastName = scan.nextLine();
			System.out.println("Whats the account type?");
			acctType = scan.nextLine();	
		}
		//deposit method to take user input for deposit
		/*
		public void deposit() {
			Scanner scan = new Scanner(System.in);
			System.out.println("How much would you like to deposit?");
			double deposit = scan.nextDouble();
			acctBalance = acctBalance + deposit;
		}
		*/
		//display balance method to displat current balance information
		/*
		public void displayBalance() {
			System.out.println("Account Last Name: " + acctHolderLastName);
			System.out.println("Account Type: " + acctType);
			System.out.println("Current Balance: $" + acctBalance + "\n\n");
		}
		*/
		//Method to set account password
		public void setAccountPassword(){
			System.out.println("** PLEASE SET ACCOUNT PIN **");
			Scanner scan = new Scanner(System.in);
			pin = scan.nextLong();
			
			//if pin not in between 1000 and 99999999 prompt for correct parameters
			while(pin < 1000 || pin > 99999999 ) {
				System.out.println("Pin must be between 4 and 8 digits.");
				pin = scan.nextLong();
			}
			//call encryptData method and set return to encryptedPin variable
			encryptedPin = encryptData(pin);
			
			//prompt user pin is set
			System.out.println("** ACCOUNT PIN SET\n\n");
		}
		//method to set encrypt key
		public long encryptData(long pin) {
			long encrypt = pin % 21;
			return encrypt;
		}
		//method to handle withdraw from accounts
		public void withdraw(double withdrawel) {
			
			//prompt for pin
			Scanner scan = new Scanner(System.in);
			System.out.println("** PLEASE ENTER PIN **");
			long password = scan.nextLong();
			
			//checked encrypted key
			while(password % 21 != encryptedPin) {
				System.out.println("** INCORRECT PIN PLEASE TRY AGAIN");
				password = scan.nextLong();
			}
			
			//prompt user for account choice
			System.out.println("** What account would you like to withdrawal from? **");
			System.out.println("** Choose 1: CHECKING");
			System.out.println("** Choose 2: SAVINGS");
			int userInput = scan.nextInt();
			
			while(userInput < 1 || userInput > 2) {
				System.out.println("Type 1 for CHECKING 2 for SAVINGS");
				userInput = scan.nextInt();
			}
			// withdrawal from checking
			if(userInput == 1) {
				System.out.println("***** CHECKING ACCOUNT *****");
				if(withdrawel > chkBalance ) {
					System.out.println("** WITHDRAWAL EXCEEDS ACCOUNT BALANCE **\n");
				}else {
					System.out.println("** WITHDRAWING $" + withdrawel + " FROM CHECKING ACCOUNT\n");
					chkBalance = chkBalance - withdrawel;
				}
				
			}
			// withdrawal from savings
			if(userInput == 2) {
				System.out.println("***** SAVINGS ACCOUNT *****");
				if(withdrawel > saveBalance ) {
					System.out.println("** WITHDRAWAL EXCEEDS ACCOUNT BALANCE **\n");
				}else {
					System.out.println("** WITHDRAWING $" + withdrawel + " FROM SAVINGS ACCOUNT\n");
					saveBalance = saveBalance - withdrawel;
				}
			}
		}
		//Method to handle account deposits
		public void deposit(double incDeposit) {
			
			//check pin number authentication
			Scanner scan = new Scanner(System.in);
			System.out.println("** PLEASE ENTER PIN **");
			long password = scan.nextLong();
			
			//If incorrect pin prompt for correct pin
			while(password % 21 != encryptedPin) {
				System.out.println("** INCORRECT PIN PLEASE TRY AGAIN");
				password = scan.nextLong();
			}
			//Prompt for user to choose account to make deposit
			System.out.println("** What account would you like to deposit to? **");
			System.out.println("** Choose 1: CHECKING");
			System.out.println("** Choose 2: SAVINGS");
			int userInput = scan.nextInt();
			
			//catch user input to make sure either 1, 2
			while(userInput < 1 || userInput > 2) {
				System.out.println("** Type 1 for CHECKING, 2 for SAVINGS");
				userInput = scan.nextInt();
			}
			// deposit to checking
			if(userInput == 1) {
				System.out.println("***** CHECKING ACCOUNT *****");
				chkBalance = chkBalance + incDeposit;
				System.out.println("** $" + incDeposit + " DEPOSITED INTO CHECKING ACCOUNT.\n");
			}
			//deposit to savings
			if(userInput == 2) {
				System.out.println("***** SAVINGS ACCOUNT *****");
				saveBalance = saveBalance + incDeposit;
				System.out.println("** $" + incDeposit + " DEPOSITED INTO SAVINGS ACCOUNT.\n");
			}
		}
		//method to handle account transfers
		public void transfer(double transferAmount) {
			Scanner scan = new Scanner(System.in);
			System.out.println("** PLEASE ENTER PIN **");
			long password = scan.nextLong();
			
			while(password % 21 != encryptedPin) {
				System.out.println("** INCORRECT PIN PLEASE TRY AGAIN");
				password = scan.nextLong();
			}
			System.out.println("** What account would you like to transfer funds from? **");
			System.out.println("** Choose 1: CHECKING");
			System.out.println("** Choose 2: SAVINGS");
			int userInput = scan.nextInt();
			
			while(userInput < 1 || userInput > 2) {
				System.out.println("Type 1 for CHECKING, 2 for SAVINGS");
				userInput = scan.nextInt();
			}
			//transfer from checking to savings
			if(userInput == 1) {
				System.out.println("***** CHECKING ACCOUNT *****");
				if(transferAmount > chkBalance) {
					System.out.println("** TRANSFER AMOUNT EXCEEDS CHECKING ACCOUNT BALANCE **\n");
				}else {
					chkBalance = chkBalance - transferAmount;
					saveBalance = saveBalance + transferAmount;
					System.out.println("** $" + transferAmount + " MOVED FROM CHECKING TO SAVINGS\n");
				}
			}
			//transfer from savings to checking
			if(userInput == 2) {
				System.out.println("Savings Account");
				if(transferAmount > saveBalance) {
					System.out.println("** TRANSFER AMOUNT EXCEEDS SAVINGS ACCOUNT BALANCE **\n");
				}else {
					saveBalance = saveBalance - transferAmount;
					chkBalance = chkBalance + transferAmount;
					System.out.println("** $" + transferAmount + " MOVED FROM SAVINGS TO CHECKING\n");
				}
			}
		}
		//method to display final balance off all accounts
		public void displayBalance() {
			Scanner scan = new Scanner(System.in);
			System.out.println("** PLEASE ENTER PIN **");
			long password = scan.nextLong();
			
			while(password % 21 != encryptedPin) {
				System.out.println("** INCORRECT PIN PLEASE TRY AGAIN");
				password = scan.nextLong();
			}
			System.out.println("***** ACCOUNT BALANCE *****");
			System.out.println("** CHECKING BALANCE: $" + chkBalance);
			System.out.println("** SAVINGS BALANCE: $" + saveBalance + "\n");
			
		}
}
