package SammysMotto;

import java.util.Scanner;

public class Rental {
	
	// final static variables that wont change
	public final static int rate_hours = 60;
	public final static double rate = 40.0;
	
	// private variables that will build the Rental object
	private String contractNum;
	private int hoursRented;
	private int minutesOver;
	private double price;
	private String phoneNumber;
	private int equipmentType;
	
	// String array for Module 8 
	public final static String[] equipmentNames = {"personal","watercraft","pontoon","boat","rowboat","canoe","kayak","beach chair","umbrella","other"};

	
	public Rental() {
		this("A000",0);
	}
	public Rental(String contractNum, int numOfMins) {
		setContractNumber(contractNum);
		setHoursAndMinutes(numOfMins);
	}
	
	// setContractNumber method to set contract number
	public void setContractNumber(String contract) {
		contractNum = contract;
	}// end setContractNumber
	
	// setHoursAndMinutes to set hours and minutes
	public void setHoursAndMinutes(int minutes) {
		hoursRented = minutes / rate_hours;
		minutesOver = minutes - hoursRented * rate_hours;
		price = hoursRented * rate + minutesOver;
		
	}// end setHoursAndMinutes()
	// method to getEquipmentType() accepts int value and sets value to equipmentType variable
		public void setEquipmentType(int equipInput) {
			if(equipInput > equipmentNames.length) {
				equipmentType = equipmentNames.length - 1;
			}else
				equipmentType = equipInput;
		}
	//get equipmentType method
	public int getEquipmentType() {
		return equipmentType;
	}
	
	public String getEquipmentName() {
		return equipmentNames[equipmentType];
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
	//method to get phone number
		public String getPhoneNumber() {
			
			//initialize and declare String to hold formatted phone number
			String formattedPhoneNumber = "";
			
			//format first 3 characters
			formattedPhoneNumber += "(" + phoneNumber.substring(0, 3) + ")";

			// formatnext three characters
			formattedPhoneNumber += phoneNumber.substring(3, 6);

			// Then append the "-" sign to the formattedPhoneNumber
			formattedPhoneNumber += "-";

			//format remaining characters
			formattedPhoneNumber += phoneNumber.substring(6, phoneNumber.length());
			
			//set formatted String to phoneNumber class variable
			phoneNumber = formattedPhoneNumber;
			
			//return phoneNumber
			return phoneNumber;
		}
	public void setPhoneNumber() {
		String tempPhone = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter phone number ");
		phoneNumber = scan.nextLine();
		
		//for loop to checks individual char and saves the digits to tempPhone
		for (int i = 0; i < phoneNumber.length(); i++) {
			if (Character.isDigit(phoneNumber.charAt(i)))
				tempPhone += phoneNumber.charAt(i);
			}
		//if number over or under 10 digits sets default
		if (tempPhone.length() < 10 || tempPhone.length() > 10)
			this.phoneNumber = "0000000000";
		else
			this.phoneNumber = tempPhone;
	}
}

