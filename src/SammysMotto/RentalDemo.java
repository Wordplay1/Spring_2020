package SammysMotto;

import java.util.Scanner;

public class RentalDemo {

	public static void main(String[] args) {
		
		// Declare new rental object
		//Rental rent = new Rental();
		
		//Send default values to contractNumber(String,int) method to print results
		//contractNumber(rent,rent.getContractNumber(),rent.getHoursRented());
		
		//Take in values from the user
		//String contractNumber = contractNumber();
		//int minutes = minutesRented();
		
		//Declare second rental object
		//Rental rent2 = new Rental(contractNumber,minutes);
		
		//Print results for rental object 2
		//contractNumber(rent2,rent2.getContractNumber(),rent2.getHoursRented());
		
		//double price = rent2.getPrice();
		
		//System.out.println(price);
		//System.out.println(rent2.getMinutesOver());
		
		
		
		// Set contract number 
		//rent.setContractNumber(contractNumber());
		
		// Set time by calling oublic method getRentalTime
		//int time = SammysRentalPriceWithMethods.getRentalTime();
		
		// Display SammysMotto by calling public method displayMotto
		//SammysRentalPriceWithMethods.displayMotto();
		
		// set hours and minutes
		//rent.setHoursAndMinutes(time);
		
		// calculate price and time, print to screen
		//SammysRentalPriceWithMethods.calculatePrice(rent);
		
		/**
		 *  Begin Unit 5 Case 2
		 */
		Rental rent1 = new Rental();
		String contract1 = contractNumber();
		rent1.setContractNumber(contract1);
		int minutes1 = minutesRented();
		rent1.setHoursAndMinutes(minutes1);
		
		Rental rent2 = new Rental();
		String contract2 = contractNumber();
		rent1.setContractNumber(contract2);
		int minutes2 = minutesRented();
		rent1.setHoursAndMinutes(minutes2);
		

		
	}
	// contractNumber() method to set contract number
	public static String contractNumber() {
		System.out.println("Enter the contract number..");
		Scanner scan = new Scanner(System.in);
		String contract = scan.nextLine();
		return contract;
	}// end contractNumber()
	public static int minutesRented() {
		System.out.println("Enter the minutes rented..");
		Scanner scan = new Scanner(System.in);
		int minutes = scan.nextInt();
		return minutes;
	}
	public static void contractNumber(Rental rent, String contractNum, int minutesX) {
		System.out.println("Contract number is: " + contractNum);
		System.out.println("Time rented: |Hours: " + rent.getHoursRented()+ "| |Minutes: " + rent.getMinutesOver()+"|");
	
	}
}
