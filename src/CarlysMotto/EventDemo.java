package CarlysMotto;

import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {

		// Instantiate the event object
		//Event event = new Event();

		// Set event number by invoking eventNumber() method
		// event.setEventNumber(eventNumber());

		// Print results for event 1
		//eventNumber(event.getEventNumber(), event.getNumberOfGuest(), 0);

		// Take in results from user to store in event 2
		//String eventNum = eventNumber();
		//int numOfGuest = numberOfGuest();

		// declare event 2 with second constructor
		//Event event2 = new Event(eventNum, numOfGuest);

		// print results for event 2
		//eventNumber(event2.getEventNumber(), event2.getNumberOfGuest(), event2.getPrice());

		// Call public method getNumberofUsers and return value to guest variable
		// int guest = CarlysEventPriceWithMethods.getNumberOfUsers();

		// Set guest in event object
		// event.setGuest(guest);

		// Call public method displayMotto() to display motto
		// CarlysEventPriceWithMethods.displayMotto();

		// calculate price of event object by calling public method calculate price
		// CarlysEventPriceWithMethods.calculatePrice(event);
		
		//start Case 1 Week 5
		Event event3 = new Event();
		String eventNum = eventNumber();
		int numGuest = numberOfGuest();
		event3.setEventNumber(eventNum);
		event3.setGuest(numGuest);
		displayResults(event3,eventNum,numGuest,event3.getPrice());
		
		Event event4 = new Event();
		String eventNumx = eventNumber();
		int numGuestx = numberOfGuest();
		event4.setEventNumber(eventNumx);
		event4.setGuest(numGuestx);
		displayResults(event4,eventNumx,numGuestx,event4.getPrice());
		
		Event event5 = new Event();
		String eventNumxy = eventNumber();
		int numGuestxy = numberOfGuest();
		event5.setEventNumber(eventNumxy);
		event5.setGuest(numGuestxy);
		displayResults(event5,eventNumxy,numGuestxy,event5.getPrice());
		
		Event event6 = compareEvents(event3,event4);
		
		System.out.println("Event event number is " + event6.getEventNumber());
		System.out.println("Number of guest is " + event6.getNumberOfGuest());
		System.out.println("Price is " + event6.getPrice());

	}

	// eventNumber() method to set event number from user input
	public static void displayResults(Event event, String eventNum, int numberOfGuest, double price) {
		// Scanner scan = new Scanner(System.in);
		System.out.println("Event event number is " + eventNum);
		System.out.println("Number of guest is " + numberOfGuest);
		if(event.isLarge()) {
			System.out.println("Event is large");
			System.out.println("Price per person is " + Event.highPricePerGuest);
		}else
			System.out.println("Price per person is " + Event.lowPricePerGuest);
		System.out.println("Price is " + price + "\n\n");
		// String event = scan.nextLine();
	}// end eventNumber()

	// contractNumber() method to set contract number
	public static String eventNumber() {
		System.out.println("Whats the event number?");
		Scanner scan = new Scanner(System.in);
		String event = scan.nextLine();
		return event;
	}// end contractNumber()

	public static int numberOfGuest() {
		System.out.println("How many guest?");
		Scanner scan = new Scanner(System.in);
		int guest = scan.nextInt();
		return guest;
	}
	public static Event compareEvents(Event e1, Event e2) {
		if(e1.getNumberOfGuest() > e2.getNumberOfGuest()) {
			return e1;
		}
		else{
			return e2;
		}
	}
}
