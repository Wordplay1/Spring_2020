package SammysMotto;

import java.util.InputMismatchException;
import java.util.Scanner;

import CarlysMotto.Event;

public class RentalDemo {

	public static void main(String[] args) {

		// Declare new rental object
		// Rental rent = new Rental();

		// Send default values to contractNumber(String,int) method to print results
		// contractNumber(rent,rent.getContractNumber(),rent.getHoursRented());

		// Take in values from the user
		// String contractNumber = contractNumber();
		// int minutes = minutesRented();

		// Declare second rental object
		// Rental rent2 = new Rental(contractNumber,minutes);

		// Print results for rental object 2
		// contractNumber(rent2,rent2.getContractNumber(),rent2.getHoursRented());

		// double price = rent2.getPrice();

		// System.out.println(price);
		// System.out.println(rent2.getMinutesOver());

		// Set contract number
		// rent.setContractNumber(contractNumber());

		// Set time by calling oublic method getRentalTime
		// int time = SammysRentalPriceWithMethods.getRentalTime();

		// Display SammysMotto by calling public method displayMotto
		// SammysRentalPriceWithMethods.displayMotto();

		// set hours and minutes
		// rent.setHoursAndMinutes(time);

		// calculate price and time, print to screen
		// SammysRentalPriceWithMethods.calculatePrice(rent);

		/**
		 * Begin Unit 5 Case 2
		 */

		// Declare rental object
		// Rental rent1 = new Rental();

		// Get contract number
		// String contract1 = contractNumber();

		// set the contract number to object
		// rent1.setContractNumber(contract1);

		// Get minutes rented
		// int minutes1 = minutesRented();

		// set minutes rented to rental object
		// rent1.setHoursAndMinutes(minutes1);

		// set phone number
		// rent1.setPhoneNumber();

		// print results
		// printRental(rent1);

		// Repeat with second rental object
		// Rental rent2 = new Rental();
		// String contract2 = contractNumber();
		// rent2.setContractNumber(contract2);
		// int minutes2 = minutesRented();
		// rent2.setHoursAndMinutes(minutes2);
		// rent2.setPhoneNumber();
		// printRental(rent2);

		// repeat with third rental objet
		// Rental rent3 = new Rental();
		// String contract3 = contractNumber();
		// rent3.setContractNumber(contract3);
		// int minutes3 = minutesRented();
		// rent3.setHoursAndMinutes(minutes3);
		// rent3.setPhoneNumber();
		// printRental(rent3);

		// Compare rental objects 1 and 2 and store in rent object 4
		// Rental rent4 = compareRentals(rent1,rent2);

		// print results rental object with largest amount of minutes rented
		// printRental(rent4);

		/*
		 * 
		 * START MODULE 9
		 * 
		 */

		// Declare array of Rental objects
		String contractNum;
		int minutes;
		int equipment;

		Rental[] r = new Rental[8];

		// for loop to create, iterate, and print results of eight rental objects
		for (int i = 0; i < 8; i++) {
			r[i] = new Rental();
			contractNum = contractNumber();
			r[i].setContractNumber(contractNum);
			minutes = minutesRented();
			r[i].setHoursAndMinutes(minutes);
			equipment = equipmentTypePrompt();
			r[i].setEquipmentType(equipment);
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
			bubbleSort(r, userInput);

			// list Event objects sorted
			for (int i = 0; i < r.length; i++) {
				System.out.println("Contract Num: " + r[i].getContractNumber());
				System.out.println("Price: $" + r[i].getPrice());
				System.out.println("Equipment Type: " + r[i].getEquipmentType());
				System.out.println("Equipment Name: " + r[i].getEquipmentName() + "\n");
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
