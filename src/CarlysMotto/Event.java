
package CarlysMotto;

import java.util.*;

/**
 * 
 * @author Donald Mears Program Description: Class Event.java to build instances
 *         of an Event.
 *
 */
public class Event {

	// Declare and initialize unchanged variables.
	public final static double lowPricePerGuest = 32;
	public final static double highPricePerGuest = 35;
	public final static int eventMax = 50;

	// Declare variables that build the event object.
	private String eventNumber;
	private int numberOfGuest;
	private double price;
	private String phoneNumber;
	private int eventType;

	// String array for module 8
	public final static String[] eventNames = { "Wedding", "Baptism", "Birthday", "Corporate", "Other" };
	
	public Event(String eventNum, int numOfGuest, int eType) {
		this.eventNumber = eventNum;
		this.numberOfGuest = numOfGuest;
		this.eventType = eType;
	}

	// setEventNumber methods to set event number
	public void setEventNumber(String event) {
		eventNumber = event;
	}// end setEventNumber()

	// setGuest() method to set number of guest
	public void setGuest(int guest) {
		numberOfGuest = guest;
		if (numberOfGuest >= eventMax) {
			price = numberOfGuest * highPricePerGuest;
		} else {
			price = numberOfGuest * lowPricePerGuest;
		}
	}// end setGuest()

	// method to getEventType() accepts int value and sets value to eventType
	// variable
	public void setEventType(int eventInput) {
		if (eventInput >= eventNames.length) {
			eventType = eventNames.length - 1;
		} else
			eventType = eventInput;
	}

	// method to return eventType
	public int getEventType() {
		return eventType;
	}

	// method to get return name based on eventType
	public String getEventName() {
		if(eventType >= eventNames.length) {
			eventType = eventNames.length - 1;
			return eventNames[eventType];
		}else {
			return eventNames[eventType];
		}
	}

	// getEventNumber() to return to event number
	public String getEventNumber() {
		return eventNumber;
	}// end getEventNumber()

	// getNumberOfguest() to return number of guest
	public int getNumberOfGuest() {
		return numberOfGuest;
	}// end getNumberOgGuest

	// getPrice() to return priceF
	public double getPrice() {
		return price;
	}// end getPrice()
		// Start chapter 5 case problem
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

	// function checks if event is large and return either true or false
	public boolean isLarge() {
		if (numberOfGuest >= eventMax) {
			return true;
		} else
			return false;
	}

	// method to set phone number
	public void setPhone() {
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
