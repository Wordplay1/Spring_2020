package Project2;

/*	Project 4
 * @author Donald Mears
 * 
 * Program Description: Test BankAccount objects build throught the BankAccount class
 * 
 * 
 */

public class TestBankAccount {

	public static void main(String[] args) {
		/*
		// Declare Ronaldo Bank Account object
		BankAccount RonaldoAccount = new BankAccount();
		
		//display balance
		RonaldoAccount.displayBalance();
		
		//prompt user to make deposit
		RonaldoAccount.deposit();
		
		//display balance
		RonaldoAccount.displayBalance();
		
		//Declare Kaylyn Account BankAccount object using second constructor
		BankAccount KaylynAccount = new BankAccount("Kaylyn","Kyle",895.0,"Saving");
		
		//display Kaylyn balance info
		KaylynAccount.displayBalance();
		
		//prompt user for deposit
		KaylynAccount.deposit();
		
		//display update balance information
		KaylynAccount.displayBalance();
		*/
		
		//initialize account action variables
		double deposit;
		double transfer;
		double withdrawal;
		
		//Create account object
		BankAccount myAccount = new BankAccount(0,0);
		
		//display current account balance for myAccount
		myAccount.displayBalance();
		
		// $100 deposit into savings
		deposit = 100;
		myAccount.deposit(deposit);
		
		// $150 deposit into checking
		deposit = 150;
		myAccount.deposit(deposit);
		myAccount.displayBalance();
		
		//transfer 50 from savings to checking
		transfer = 50;
		myAccount.transfer(transfer);
		myAccount.displayBalance();
		
		//attempt to withdrawal $200 
		withdrawal = 200;
		myAccount.withdraw(withdrawal);
		
		//withdrawal $25 from savings
		withdrawal = 25;
		myAccount.withdraw(withdrawal);
		
		//display account balance
		myAccount.displayBalance();
		
		
		
	}

}
