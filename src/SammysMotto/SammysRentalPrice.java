package SammysMotto;

import java.util.Scanner;

public class SammysRentalPrice {

	public static void main(String[] args) {
		/* Begin Unit 2 
		 * 
		 * Unit 2 Case 2
		 * 
		 * */
			//Initialize variables
			int timeRented = 0;
			double cost = 0;
			double dollarPerMinute = 0;
			
			//open scanner for user input
			Scanner scan = new Scanner(System.in);
			//take in user input
			System.out.println("Please enter total time equipment was rented in minutes...");
			timeRented = scan.nextInt();
			
			//Algorithm to calculate hours, minutes, and seconds
			int minutes = timeRented % 60;
			int seconds = timeRented / 60;
			int hours = seconds % 60;
			seconds = seconds / 60;
			
			// If/else statement to determine if time rented less than or over 60 minutes
			// Prints out cost and time equipment was rented
			if(timeRented <= 60) {
				cost = 40.0;
				System.out.println("The cost for rental equipment is : $" + cost);
				System.out.println("Time rented: |Hours: " + hours + "| |Minutes: " + minutes + "| |Seconds: " + seconds + "|");
			}else {
				cost = 40.0;
				dollarPerMinute = timeRented - 60;
				while(dollarPerMinute > 0) {
					cost = cost + 1.0;
					dollarPerMinute--;
				}
				System.out.println("The cost for rental equipment is : $" + cost);
				System.out.println("Time rented: |Hours: " + hours + "| |Minutes: " + minutes + "| |Seconds: " + seconds + "|");
			}

	}

}
