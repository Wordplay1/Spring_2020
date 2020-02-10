package SammysMotto;

import java.util.Scanner;

public class SammysRentalPriceWithMethods {

	public static void main(String[] args) {
		
		// declare variable to hold time rented and invoke getRentalTime() method
		int timeRented = getRentalTime();
		// Invoke displayMotto() method to display Sammy's motto.
		displayMotto();
		//calculatePrice(timeRented);

	}
	
	// getRentalTime() method to get time in minutes
	public static int getRentalTime() {
		

		
		// open scanner for user input
		Scanner scan = new Scanner(System.in);
		// take in user input
		System.out.println("Please enter total time equipment was rented in minutes...");
		int time = scan.nextInt();
		// close scanner
		scan.close();
		
		// return minutes back to main
		return time;
	}// end getRentalTime()
	
	// diplayMotto() method to display Sammy's Motto
	public static void displayMotto() {
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("SS Sammy’s makes it fun in the sun. SS");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n\n");

	}// end displayMotto()
	public static void calculatePrice(Rental rent) {
		
		double cost = 0;
		double dollarPerMinute = 0;
		
		System.out.println("Contract Number: "+rent.getContractNumber());
		
		//Algorithm to calculate hours, minutes, and seconds
		int minutes = rent.getHoursRented() % Rental.hours;
		int seconds = rent.getHoursRented() / Rental.hours;
		int hours = seconds % Rental.hours;
		seconds = seconds / Rental.hours;
		
		// If/else statement to determine if time rented less than or over 60 minutes
		// Prints out cost and time equipment was rented
		if(rent.getHoursRented() <= Rental.hours) {
			cost = Rental.rate;
			System.out.println("The cost for rental equipment is : $" + cost);
			System.out.println("Time rented: |Hours: " + hours + "| |Minutes: " + minutes + "| |Seconds: " + seconds + "|");
		}else {
			cost = Rental.rate;
			dollarPerMinute = rent.getHoursRented() - Rental.hours;
			while(dollarPerMinute > 0) {
				cost = cost + 1.0;
				dollarPerMinute--;
			}
			System.out.println("The cost for rental equipment is : $" + cost);
			System.out.println("Time rented: |Hours: " + hours + "| |Minutes: " + minutes + "| |Seconds: " + seconds + "|");
		}

	}

}
