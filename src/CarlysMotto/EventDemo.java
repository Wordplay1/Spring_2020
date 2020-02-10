package CarlysMotto;

import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {
		
		//Instantiate the event object
		Event event = new Event();
		
		// Set event number by invoking eventNumber() method
		event.setEventNumber(eventNumber());
		
		// Call public method getNumberofUsers and return value to guest variable
		int guest = CarlysEventPriceWithMethods.getNumberOfUsers();
		
		// Set guest in event object
		event.setGuest(guest);
		
		// Call public method displayMotto() to display motto
		CarlysEventPriceWithMethods.displayMotto();
		
		// calculate price of event object by calling public method calculate price
		CarlysEventPriceWithMethods.calculatePrice(event);
		
		
	}
	// eventNumber() method to set event number from user input
	public static String eventNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter event number..");
		String event = scan.nextLine();
		return event;
	}// end eventNumber()

}
