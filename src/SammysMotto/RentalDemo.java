package SammysMotto;

import java.util.Scanner;

public class RentalDemo {

	public static void main(String[] args) {
		
		// Declare new rental object
		Rental rent = new Rental();
		
		// Set contract number 
		rent.setContractNumber(contractNumber());
		
		// Set time by calling oublic method getRentalTime
		int time = SammysRentalPriceWithMethods.getRentalTime();
		
		// Display SammysMotto by calling public method displayMotto
		SammysRentalPriceWithMethods.displayMotto();
		
		// set hours and minutes
		rent.setHoursAndMinutes(time);
		
		// calculate price and time, print to screen
		SammysRentalPriceWithMethods.calculatePrice(rent);


	}
	// contractNumber() method to set contract number
	public static String contractNumber() {
		System.out.println("Please enter contract number: \n");
		Scanner scan = new Scanner(System.in);
		String contract = scan.nextLine();
		return contract;
	}// end contractNumber()
}
