package SammysMotto;

import java.util.Scanner;

/*
 * @author: Donald Mears
 * @title: Remtal.java
 * @description: Rental.java class to build Rental objects
 */
public class Rental {

	// final static variables that wont change
	public final static int rate_hours = 60;
	public final static double rate = 40.0;
	public final static double lesson_rate = 27.0;

	// private variables that will build the Rental object
	private String contractNum;
	private int hoursRented;
	private int minutesOver;
	private double price;
	private String phoneNumber;
	private int equipmentType;
	private double basePrice;
	private Equipment equipmentObj;
	private int minutesRented;
	private boolean lessonRequired;
	
	// 1st constructor for rental object 
	public Rental(String contractNumber, int minRented, int equipType) {
		contractNum = contractNumber;
		minutesRented = minRented;
		equipmentType = equipType;
		lessonRequired = false;

		setHoursAndMinutes();

		if (equipmentType == 0 || equipmentType == 1) {
			lessonRequired = true;
		}
		if (lessonRequired) {
			EquipmentWithLessons e = new EquipmentWithLessons(equipmentType);
			equipmentObj = e;
			price = basePrice + e.getRentalFee();
		} else {
			EquipmentWithoutLessons e = new EquipmentWithoutLessons(equipmentType);
			equipmentObj = e;
			price = basePrice;

		}
	}

	// setContractNumber method to set contract number
	public void setContractNumber(String contract) {
		contractNum = contract;
	}// end setContractNumber

	// setHoursAndMinutes to set hours and minutes
	public void setHoursAndMinutes() {
		hoursRented = minutesRented / rate_hours;
		minutesOver = minutesRented - hoursRented * rate_hours;
		basePrice = hoursRented * rate + minutesOver;

	}// end setHoursAndMinutes()

	// get equipmentType method
	public int getEquipmentType() {
		return equipmentType;
	}

	// method to get contract number
	public String getContractNumber() {
		return contractNum;
	}// end getContractNumber()

	// method to get hours rented
	public int getHoursRented() {
		return hoursRented;
	}// end getHoursRented()

	// method to get minutes over
	public int getMinutesOver() {
		return minutesOver;
	}// end minutesOver()

	// method to get price
	public double getPrice() {
		return price;
	}// end getPrice()

	public double getBasePrice() {
		return basePrice;
	}

	public Equipment getEquipmentObj() {
		return equipmentObj;
	}

	// method to get phone number
	public String getPhoneNumber() {

		// initialize and declare String to hold formatted phone number
		String formattedPhoneNumber = "";

		// format first 3 characters
		formattedPhoneNumber += "(" + phoneNumber.substring(0, 3) + ")";

		// formatnext three characters
		formattedPhoneNumber += phoneNumber.substring(3, 6);

		// Then append the "-" sign to the formattedPhoneNumber
		formattedPhoneNumber += "-";

		// format remaining characters
		formattedPhoneNumber += phoneNumber.substring(6, phoneNumber.length());

		// set formatted String to phoneNumber class variable
		phoneNumber = formattedPhoneNumber;

		// return phoneNumber
		return phoneNumber;
	}

	public void setPhoneNumber() {
		String tempPhone = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter phone number ");
		phoneNumber = scan.nextLine();

		// for loop to checks individual char and saves the digits to tempPhone
		for (int i = 0; i < phoneNumber.length(); i++) {
			if (Character.isDigit(phoneNumber.charAt(i)))
				tempPhone += phoneNumber.charAt(i);
		}
		// if number over or under 10 digits sets default
		if (tempPhone.length() < 10 || tempPhone.length() > 10)
			this.phoneNumber = "0000000000";
		else
			this.phoneNumber = tempPhone;
	}
}
