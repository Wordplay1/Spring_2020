package SammysMotto;

import java.io.BufferedOutputStream;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.InputMismatchException;
import java.util.Scanner;

import CarlysMotto.DinnerEvent;
import CarlysMotto.Event;

/*
 * @author: Donald Mears
 * @title: RentalDemoAndCreateFile
 * @description: Program creates 2 rental objects and prints them to external text file
 * 
 */

public class RentalDemoAndCreateFile {

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
		/*
		 * // Declare array of Rental objects String contractNum; int minutes; int
		 * equipment;
		 * 
		 * Rental[] r = new Rental[8];
		 * 
		 * // for loop to create, iterate, and print results of eight rental objects for
		 * (int i = 0; i < 8; i++) { r[i] = new Rental(); contractNum =
		 * contractNumber(); r[i].setContractNumber(contractNum); minutes =
		 * minutesRented(); r[i].setHoursAndMinutes(minutes); equipment =
		 * equipmentTypePrompt(); r[i].setEquipmentType(equipment); } // Prompt user for
		 * sorting options sortOptions(); Scanner scan = new Scanner(System.in); int
		 * userInput = scan.nextInt();
		 * 
		 * // while loop for user input validation while (userInput > 3) { try {
		 * System.out.println("Must be between -1,1,2,3"); userInput = scan.nextInt(); }
		 * catch (InputMismatchException e) {
		 * System.out.println("Invalid, please enter an integer"); scan.nextLine(); } }
		 * 
		 * // sentinel loop to prompt user for options until sentinel is entered while
		 * (userInput != -1) { bubbleSort(r, userInput);
		 * 
		 * // list Event objects sorted for (int i = 0; i < r.length; i++) {
		 * System.out.println("Contract Num: " + r[i].getContractNumber());
		 * System.out.println("Price: $" + r[i].getPrice());
		 * System.out.println("Equipment Type: " + r[i].getEquipmentType());
		 * System.out.println("Equipment Name: " + r[i].getEquipmentName() + "\n"); } //
		 * Prompt user again for sorting options sortOptions(); userInput =
		 * scan.nextInt(); while (userInput > 4) { try {
		 * System.out.println("Must be between -1,1,2,3"); userInput = scan.nextInt(); }
		 * catch (InputMismatchException e) {
		 * System.out.println("Invalid, please enter an integer"); scan.nextLine(); } }
		 * 
		 * } System.out.print("Exiting Program...");
		 */
		/*
		 * 
		 * START MODULE 10
		 * 
		 * 
		 * 
		 * String contract; int minutes; int equipment;
		 * 
		 * //Declare LessonWithRental object array LessonWithRental[] d = new
		 * LessonWithRental[4];
		 * 
		 * //Build 4 LessonWithRental objects for(int i = 0; i < d.length; i++) {
		 * contract = contractNumber(); minutes = minutesRented(); equipment =
		 * equipmentTypePrompt(); d[i] = new
		 * LessonWithRental(contract,minutes,equipment); d[i].getInstructor(); }
		 * 
		 * // Prompt user for sorting options sortOptions(); Scanner scan = new
		 * Scanner(System.in); int userInput = scan.nextInt();
		 * 
		 * // while loop for user input validation while (userInput > 3) { try {
		 * System.out.println("Must be between -1,1,2,3"); userInput = scan.nextInt(); }
		 * catch (InputMismatchException e) {
		 * System.out.println("Invalid, please enter an integer"); scan.nextLine(); } }
		 * 
		 * // sentinel loop to prompt user for options until sentinel is entered while
		 * (userInput != -1) { bubbleSort(d, userInput);
		 * 
		 * // list Event objects sorted for (int i = 0; i < d.length; i++) {
		 * System.out.println("Contract Num: " + d[i].getContractNumber());
		 * System.out.println("Price: $" + d[i].getPrice());
		 * System.out.println("Equipment Type: " + d[i].getEquipmentType());
		 * System.out.println("Equipment Name: " + d[i].getEquipmentName());
		 * d[i].getInstructor(); } // Prompt user again for sorting options
		 * sortOptions(); userInput = scan.nextInt(); while (userInput > 4) { try {
		 * System.out.println("Must be between -1,1,2,3"); userInput = scan.nextInt(); }
		 * catch (InputMismatchException e) {
		 * System.out.println("Invalid, please enter an integer"); scan.nextLine(); } }
		 * 
		 * }
		 */

		/*
		 * 
		 * START MODULE 11
		 * 
		 

		// Declare variables
		String contractNumber;
		int minutesRented;
		int equipmentType;
		Equipment equipment;

		// get Object information from the user
		contractNumber = contractNumber();
		minutesRented = minutesRented();
		equipmentType = equipmentTypePrompt();

		// declare and initialize Rental object
		Rental r = new Rental(contractNumber, minutesRented, equipmentType);

		// retrieve child equipment object created in Equipment constructor
		equipment = r.getEquipmentObj();

		// print details
		printRental(r, equipment);
		*/
		
		/*
		 * 
		 * START MODULE 13 CASE 2
		 * 
		 */
		
		// declare variables
		String contractNum;
		int minutesRented;
		int equipmentType;
		Equipment equipObj;

		// declare and initialize file
		Path file = Paths.get("/Users/donaldmears/Documents/Wilmington University/CSC335/data.rtf");
		
		Rental[] rent = new Rental[3];

		// loop to gain user input, create single object, send to WriteObjectToFile()
		// method
		for (int i = 0; i < rent.length; i++) {
			
			contractNum = contractNumber();
			minutesRented = minutesRented();
			equipmentType = equipmentTypePrompt();
			

			rent[i] = new Rental(contractNum, minutesRented, equipmentType);
			
			equipObj = rent[i].getEquipmentObj();

			WriteObjectToFile(rent[i],equipObj, file);
		}

		System.out.print("Exiting Program...");

	}//method to print objects to file
	public static void WriteObjectToFile(Rental r, Equipment e, Path file) {

		String s = "Contract Number: " + r.getContractNumber() + "\nEquipment Type: " + e.getEquipmentType() + "\nEquipment Name: " + e.getEquipmentName() + "\nPrice: " + r.getPrice() + "\n" +
				"Time rented: |Hours: " + r.getHoursRented() + "| |Minutes: " + r.getMinutesOver() + "|\n" + e.getLessonPolicy() + "\n\n";
		System.out.println(s);
		byte[] data = s.getBytes();
		OutputStream output = null;
		try {
			output = new BufferedOutputStream(
					Files.newOutputStream(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND));
			output.write(data);
			output.flush();
			output.close();
			System.out.println("Input printed to file. \n\n");
		} catch (Exception a) {
			System.out.println("No file.");
		}

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
		final int MIN_MINS = 60;
		final int MAX_MINS = 7200;
		Scanner scan = new Scanner(System.in);
		int minutes = 0;
		System.out.println("Enter the minutes rented");
		do {
			try {
				minutes = scan.nextInt();
				if (minutes < MIN_MINS || minutes > MAX_MINS) {
					System.out.println("Not valid number please enter number between 60 - 7200");
				}
			} catch (InputMismatchException e) {
				System.out.println("Must be an integer");
				scan.next();
			}
		} while (minutes < MIN_MINS || minutes > MAX_MINS);
		return minutes;
	}

	// Method to print results of rental object
	public static void printRental(Rental rent, Equipment e) {

		String s1 = rent.getContractNumber();
		s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();

		System.out.println("Contract number is: " + s1);
		System.out.println("Equipment type is: " + e.getEquipmentName());
		System.out.println("Base price is: " + rent.getBasePrice());
		String s2 = e.getLessonPolicy();
		System.out.println(s2);
		System.out.println("Final price is: " + rent.getPrice());
		System.out.println(
				"Time rented: |Hours: " + rent.getHoursRented() + "| |Minutes: " + rent.getMinutesOver() + "|\n\n");

		/*
		 * int hours = rent.getHoursRented() % Rental.rate_hours; int i = 0;
		 * 
		 * 
		 * do { System.out.println((i + 1) + "." +
		 * " Coupon good for 10% off next rental!"); i++; } while (i < hours);
		 */
	}

	// method to show sort options
	public static void sortOptions() {
		System.out.println("** How would you like to sort the rentals?");
		System.out.println("** Choose 1 - Contract Number");
		System.out.println("** Choose 2 - Price");
		System.out.println("** Choose 3 - Equipment Type");
		System.out.println("** Choose -1 - Exit\n");
	}

	// equipmentTypePrompt() method to prompt user for equipment type
	public static int equipmentTypePrompt() {
		final int EQUIP_MIN = 0;
		final int EQUIP_MAX = 7;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please equipment type");
		int equipment = -1;

		do {
			try {
				equipment = scan.nextInt();
				if (equipment < EQUIP_MIN || equipment > EQUIP_MAX) {
					System.out.println("Not valid number please enter number between 0 - 7");
				}
			} catch (InputMismatchException e) {
				System.out.println("Must be an integer");
				scan.next();
			}
		} while (equipment < EQUIP_MIN || equipment > EQUIP_MAX);
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
