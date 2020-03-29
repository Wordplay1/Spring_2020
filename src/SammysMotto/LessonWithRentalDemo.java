package SammysMotto;

import java.util.InputMismatchException;

import java.util.Scanner;

import CarlysMotto.Event;

/* @Author: Donald Mears
 * Title: LessonWithRentalDemo.java
 * Description: LessonWithRentalDemo to test LessonWithRental.java class.
 * 
 * 
 * 
 */

public class LessonWithRentalDemo {

	public static void main(String[] args) {

		 /*
		  * 
		  * START MODULE 10
		  * 
		 */
		String contract;
		int minutes;
		int equipment;
		
		//Declare LessonWithRental object array
		LessonWithRental[] d = new LessonWithRental[4];
		
		//Build 4 LessonWithRental objects
		for(int i = 0; i < d.length; i++) {
			contract = contractNumber();
			minutes = minutesRented();
			equipment = equipmentTypePrompt();
			d[i] = new LessonWithRental(contract,minutes,equipment);
			d[i].getInstructor();
		}
		
		// Prompt user for sorting options
				sortOptions();
				Scanner scan = new Scanner(System.in);
				int userInput = scan.nextInt();

				// while loop for user input validation
				while (userInput > 3) {
					try {
						System.out.println("Must be between -1,1,2,3");
						userInput = scan.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid, please enter an integer");
						scan.nextLine();
					}
				}

				// sentinel loop to prompt user for options until sentinel is entered
				while (userInput != -1) {
					bubbleSort(d, userInput);

					// list Event objects sorted
					for (int i = 0; i < d.length; i++) {
						System.out.println("Contract Num: " + d[i].getContractNumber());
						System.out.println("Price: $" + d[i].getPrice());
						System.out.println("Equipment Type: " + d[i].getEquipmentType());
						System.out.println("Equipment Name: " + d[i].getEquipmentName());
						d[i].getInstructor();
					}
					// Prompt user again for sorting options
					sortOptions();
					userInput = scan.nextInt();
					while (userInput > 4) {
						try {
							System.out.println("Must be between -1,1,2,3");
							userInput = scan.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Invalid, please enter an integer");
							scan.nextLine();
						}
					}

				}
				System.out.print("Exiting Program...");
		
	}

	// contractNumber() method to set contract number
	public static String contractNumber() {
		System.out.println("Enter the contract number..");
		Scanner scan = new Scanner(System.in);
		String contract = scan.nextLine();

		if (contract.length() < 4 || contract.length() > 4)
			contract = "A000";
		// if length equal to 4 check each character to see if they meet parameters, if
		// not set to default
		if (contract.length() == 4) {
			if (!Character.isAlphabetic(contract.charAt(0)) || !Character.isDigit(contract.charAt(1))
					|| !Character.isDigit(contract.charAt(2)) || !Character.isDigit(contract.charAt(3)))
				contract = "A000";
			return contract;
		} else {
			return contract;
		}
	}// end contractNumber()
		// method to get minutes rented from user

	public static int minutesRented() {
		System.out.println("Enter the minutes rented..");
		Scanner scan = new Scanner(System.in);
		int minutes = scan.nextInt();

		while (minutes < 60 || minutes > 7200) {
			System.out.println("Please try again..");
			minutes = scan.nextInt();
		}
		return minutes;
	}

	// Method to print results of rental object
	public static void printRental(Rental rent) {

		String s1 = rent.getContractNumber();
		s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();

		System.out.println("Contract number is: " + s1);
		System.out.println("Phone number is: " + rent.getPhoneNumber());
		System.out.println("Price is: " + rent.getPrice());
		System.out.println(
				"Time rented: |Hours: " + rent.getHoursRented() + "| |Minutes: " + rent.getMinutesOver() + "|\n\n");

		int hours = rent.getHoursRented() % Rental.rate_hours;
		int i = 0;

		do {
			System.out.println((i + 1) + "." + " Coupon good for 10% off next rental!");
			i++;
		} while (i < hours);
	}

	// method to show sort options
	public static void sortOptions() {
		System.out.println("** How would you like to sort the rentals?");
		System.out.println("** Choose 1 - Contract Number");
		System.out.println("** Choose 2 - Price");
		System.out.println("** Choose 3 - Equipment Type");
		System.out.println("** Choose -1 - Exit\n");
	}
	//equipmentTypePrompt() method to prompt user for equipment type
	public static int equipmentTypePrompt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please equipment type");
		int equipment = scan.nextInt();

		while (equipment < 0 || equipment > 8) {
			System.out.println("Please try again..");
			equipment = scan.nextInt();
		}
		return equipment;
	}

	// method to to perform bubblesort on object array
	public static void bubbleSort(Rental[] r, int userInput) {

		int a, b;
		Rental temp;
		int highSubscript = r.length - 1;

		switch (userInput) {
		case 1:
			System.out.println("** Sorting by Contract Number ascending...\n");
			System.out.println();
			for (a = 0; a < highSubscript; ++a) {
				for (b = 0; b < highSubscript; ++b) {
					if (r[b].getContractNumber().compareTo(r[b + 1].getContractNumber()) > 0) {
						temp = r[b];
						r[b] = r[b + 1];
						r[b + 1] = temp;
					}
				}
			}
			break;
		case 2:
			System.out.println("** Sorting by Price ascending...\n");
			for (a = 0; a < highSubscript; ++a) {
				for (b = 0; b < highSubscript; ++b) {
					if (r[b].getPrice() > r[b + 1].getPrice()) {
						temp = r[b];
						r[b] = r[b + 1];
						r[b + 1] = temp;
					}
				}
			}
			break;
		case 3:
			System.out.println("** Sorting by Equipment Type ascending...\n");
			for (a = 0; a < highSubscript; ++a) {
				for (b = 0; b < highSubscript; ++b) {
					if (r[b].getEquipmentType() > r[b + 1].getEquipmentType()) {
						temp = r[b];
						r[b] = r[b + 1];
						r[b + 1] = temp;
					}
				}
			}
			break;
		}
	}
	/*
	 * //Method to compare rental objects public static Rental compareRentals(Rental
	 * r1, Rental r2) { if(r1.getHoursRented() > r2.getHoursRented()) { return r1; }
	 * else{ return r2; } }
	 */
}
