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
		/*
		//Declare event object
		Event event3 = new Event();
		
		//Get event number
		String eventNum = eventNumber();
		
		//Get number of guest
		int numGuest = numberOfGuest();
		
		//Set event number
		event3.setEventNumber(eventNum);
		
		//set guest
		event3.setGuest(numGuest);
		
		event3.setPhone();
		
		//Display results for event object
		displayResults(event3,eventNum,numGuest,event3.getPrice(),event3.getPhoneNumber());
		
		
		
		
		Event event4 = new Event();
		String eventNumx = eventNumber();
		int numGuestx = numberOfGuest();
		event4.setEventNumber(eventNumx);
		event4.setGuest(numGuestx);
		event4.setPhone();
		displayResults(event4,eventNumx,numGuestx,event4.getPrice(),event4.getPhoneNumber());
	
		
		Event event5 = new Event();
		String eventNumxy = eventNumber();
		int numGuestxy = numberOfGuest();
		event5.setEventNumber(eventNumxy);
		event5.setGuest(numGuestxy);
		event5.setPhone();
		displayResults(event5,eventNumxy,numGuestxy,event5.getPrice(),event5.getPhoneNumber());
		*/
		//compare two event objects and return largest event to event6
		//Event event6 = compareEvents(event3,event4);
		
		/*
		//Print results of largest event
		System.out.println("Event event number is " + event6.getEventNumber());
		System.out.println("Number of guest is " + event6.getNumberOfGuest());
		System.out.println("Price is " + event6.getPrice());
		*/
		
		/*
		 * 
		 * MODULE 8 START
		 */
		Event[]  e = new Event[3];
		
		for(int i = 0; i < 3; i++) {
			e[i] = new Event();
			e[i].setEventType(i);
			System.out.println("Event Type: " + e[i].getEventType());
			System.out.println("Event Name: " + e[i].getEventName() + "\n");
		}
	}

	// eventNumber() method to set event number from user input
	public static void displayResults(Event event, String eventNum, int numberOfGuest, double price, String phoneNumber) {
		
		// Convert first letter to capital if lowercase
		String s1 = event.getEventNumber(); 
		s1 = s1.substring(0,1).toUpperCase() + s1.substring(1).toLowerCase();
		
		System.out.println("Event event number is " + s1);
		System.out.println("Number of guest is " + numberOfGuest);
		System.out.println("Phone number is: " + phoneNumber);
		if(event.isLarge()) {
			System.out.println("Event is large");
			System.out.println("Price per person is " + Event.highPricePerGuest);
		}else
			System.out.println("Price per person is " + Event.lowPricePerGuest);
		System.out.println("Price is " + price + "\n\n");
		// String event = scan.nextLine();
		/*
		for(int i = 0; i < numberOfGuest; i++) {
			System.out.println("Please come to my event!");
		}*/
	}// end eventNumber()

	// contractNumber() method to set contract number
	public static String eventNumber() {
		System.out.println("\n\nWhats the event number?");
		Scanner scan = new Scanner(System.in);
		String event = scan.nextLine();
		//event.toUpper(charAt(0));
		
		//check length of userInput event number, if to long or to short set default event number
		if(event.length()<4 || event.length() > 4)
	           event = "A000";
		//if length equal to 4 check each character to see if they meet parameters, if not set to default
	    if(event.length()==4){
	           if(!Character.isAlphabetic(event.charAt(0)) || !Character.isDigit(event.charAt(1))||!Character.isDigit(event.charAt(2))||
	              !Character.isDigit(event.charAt(3)))
	        	   event = "A000";
	           	return event;
	       }else {
	    	   return event;
	       }
		
	}// end contractNumber()

	public static int numberOfGuest() {
		System.out.println("How many guest?");
		Scanner scan = new Scanner(System.in);
		int guest = scan.nextInt();
		
		while(guest < 5 || guest > 100) {
			System.out.println("Please try again..");
			guest = scan.nextInt();
		}
		return guest;
	}
	/*
	public static Event compareEvents(Event e1, Event e2) {
		if(e1.getNumberOfGuest() > e2.getNumberOfGuest()) {
			return e1;
		}
		else{
			return e2;
		}
	}*/
}
