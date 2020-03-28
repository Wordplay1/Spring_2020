package CarlysMotto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DinnerEventDemo {

	public static void main(String[] args) {
		/*
		 * // Instantiate the event object //Event event = new Event();
		 * 
		 * // Set event number by invoking eventNumber() method //
		 * event.setEventNumber(eventNumber());
		 * 
		 * // Print results for event 1 //eventNumber(event.getEventNumber(),
		 * event.getNumberOfGuest(), 0);
		 * 
		 * // Take in results from user to store in event 2 //String eventNum =
		 * eventNumber(); //int numOfGuest = numberOfGuest();
		 * 
		 * // declare event 2 with second constructor //Event event2 = new
		 * Event(eventNum, numOfGuest);
		 * 
		 * // print results for event 2 //eventNumber(event2.getEventNumber(),
		 * event2.getNumberOfGuest(), event2.getPrice());
		 * 
		 * // Call public method getNumberofUsers and return value to guest variable //
		 * int guest = CarlysEventPriceWithMethods.getNumberOfUsers();
		 * 
		 * // Set guest in event object // event.setGuest(guest);
		 * 
		 * // Call public method displayMotto() to display motto //
		 * CarlysEventPriceWithMethods.displayMotto();
		 * 
		 * // calculate price of event object by calling public method calculate price
		 * // CarlysEventPriceWithMethods.calculatePrice(event);
		 * 
		 * //start Case 1 Week 5
		 * 
		 * //Declare event object Event event3 = new Event();
		 * 
		 * //Get event number String eventNum = eventNumber();
		 * 
		 * //Get number of guest int numGuest = numberOfGuest();
		 * 
		 * //Set event number event3.setEventNumber(eventNum);
		 * 
		 * //set guest event3.setGuest(numGuest);
		 * 
		 * event3.setPhone();
		 * 
		 * //Display results for event object
		 * displayResults(event3,eventNum,numGuest,event3.getPrice(),event3.
		 * getPhoneNumber());
		 * 
		 * 
		 * 
		 * 
		 * Event event4 = new Event(); String eventNumx = eventNumber(); int numGuestx =
		 * numberOfGuest(); event4.setEventNumber(eventNumx);
		 * event4.setGuest(numGuestx); event4.setPhone();
		 * displayResults(event4,eventNumx,numGuestx,event4.getPrice(),event4.
		 * getPhoneNumber());
		 * 
		 * 
		 * Event event5 = new Event(); String eventNumxy = eventNumber(); int numGuestxy
		 * = numberOfGuest(); event5.setEventNumber(eventNumxy);
		 * event5.setGuest(numGuestxy); event5.setPhone();
		 * displayResults(event5,eventNumxy,numGuestxy,event5.getPrice(),event5.
		 * getPhoneNumber());
		 * 
		 * //compare two event objects and return largest event to event6 //Event event6
		 * = compareEvents(event3,event4);
		 * 
		 * 
		 * //Print results of largest event System.out.println("Event event number is "
		 * + event6.getEventNumber()); System.out.println("Number of guest is " +
		 * event6.getNumberOfGuest()); System.out.println("Price is " +
		 * event6.getPrice());
		 */

		/*
		 * 
		 * MODULE 9 START
		 * 
		 * 
		 * // Declare array of Event objects String eventNum; int guestNum; int
		 * eventType; Event[] e = new Event[8];
		 * 
		 * // for loop to create, iterate, and print results of three Event objects for
		 * (int i = 0; i < e.length; i++) { e[i] = new Event(); eventNum =
		 * eventNumber(); e[i].setEventNumber(eventNum); guestNum = numberOfGuest();
		 * e[i].setGuest(guestNum); eventType = eventTypePrompt();
		 * e[i].setEventType(eventType); } // Prompt user for sorting options
		 * sortOptions(); Scanner scan = new Scanner(System.in); int userInput =
		 * scan.nextInt();
		 * 
		 * // while loop for user input validation while (userInput > 3) { try {
		 * System.out.println("Must be between -1,1,2,3"); userInput = scan.nextInt(); }
		 * catch (InputMismatchException r) {
		 * System.out.println("Invalid, please enter an integer"); scan.nextLine(); } }
		 * 
		 * // sentinel loop to prompt user for options until sentinel is entered while
		 * (userInput != -1) { bubbleSort(e, userInput);
		 * 
		 * // list Event objects sorted for (int i = 0; i < e.length; i++) {
		 * System.out.println("Event Num: " + e[i].getEventNumber());
		 * System.out.println("Guest Num: " + e[i].getNumberOfGuest());
		 * System.out.println("Event Type: " + e[i].getEventType());
		 * System.out.println("Event Name: " + e[i].getEventName() + "\n"); } // Prompt
		 * user again for sorting options sortOptions(); userInput = scan.nextInt();
		 * while (userInput > 4 || userInput < -1) { try {
		 * System.out.println("Must be between -1,1,2,3"); userInput = scan.nextInt(); }
		 * catch (InputMismatchException r) {
		 * System.out.println("Invalid, please enter an integer"); scan.nextLine(); } }
		 * 
		 * } System.out.print("Exiting Program...");
		 */

		/*
		 * START MODULE 10
		 * 
		 */
		String eventNum;
		int guestNum;
		int entree;
		int side1;
		int side2;
		int dessert;
		int eventType;

		DinnerEvent[] d = new DinnerEvent[4];

		for (int i = 0; i < d.length; i++) {
			eventNum = eventNumber();
			guestNum = numberOfGuest();
			eventType = eventTypePrompt();
			entree = setEntree();
			side1 = setSides();
			side2 = setSidesTwo();
			dessert = setDessert();
			d[i] = new DinnerEvent(eventNum, guestNum, eventType, entree, side1, side2, dessert);
			d[i].getMenu();
		}
		sortOptions();
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();

		// while loop for user input validation
		while (userInput > 3) {
			try {
				System.out.println("Must be between -1,1,2,3");
				userInput = scan.nextInt();
			} catch (InputMismatchException r) {
				System.out.println("Invalid, please enter an integer");
				scan.nextLine();
			}
		}
		while (userInput != -1) {
			bubbleSort(d, userInput);

			// list Event objects sorted
			for (int i = 0; i < d.length; i++) {
				System.out.println("Event Num: " + d[i].getEventNumber());
				System.out.println("Guest Num: " + d[i].getNumberOfGuest());
				System.out.println("Event type: " + d[i].getEventType());
				System.out.println("Event name: " + d[i].getEventName());
				d[i].getMenu();
			}
			// Prompt user again for sorting options
			sortOptions();
			userInput = scan.nextInt();
			while (userInput > 4 || userInput < -1) {
				try {
					System.out.println("Must be between -1,1,2,3");
					userInput = scan.nextInt();
				} catch (InputMismatchException r) {
					System.out.println("Invalid, please enter an integer");
					scan.nextLine();
				}
			}

		}
		System.out.print("Exiting Program...");

	}
	/*
	// eventNumber() method to set event number from user input
	public static void displayResults(Event event, String eventNum, int numberOfGuest, double price,
			String phoneNumber) {

		// Convert first letter to capital if lowercase
		String s1 = event.getEventNumber();
		s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();

		System.out.println("Event event number is " + s1);
		System.out.println("Number of guest is " + numberOfGuest);
		System.out.println("Phone number is: " + phoneNumber);
		if (event.isLarge()) {
			System.out.println("Event is large");
			System.out.println("Price per person is " + Event.highPricePerGuest);
		} else
			System.out.println("Price per person is " + Event.lowPricePerGuest);
		System.out.println("Price is " + price + "\n\n");
		// String event = scan.nextLine();
		
		 	for(int i = 0; i < numberOfGuest; i++) {
		 		System.out.println("Please come to my event!"); }
		 
	}// end eventNumber()
	*/
	// contractNumber() method to set contract number
	public static String eventNumber() {
		System.out.println("\n\nWhats the event number?");
		Scanner scan = new Scanner(System.in);
		String event = scan.nextLine();
		// event.toUpper(charAt(0));

		// check length of userInput event number, if to long or to short set default
		// event number
		if (event.length() < 4 || event.length() > 4)
			event = "A000";
		// if length equal to 4 check each character to see if they meet parameters, if
		// not set to default
		if (event.length() == 4) {
			if (!Character.isAlphabetic(event.charAt(0)) || !Character.isDigit(event.charAt(1))
					|| !Character.isDigit(event.charAt(2)) || !Character.isDigit(event.charAt(3)))
				event = "A000";
			return event;
		} else {
			return event;
		}

	}// end contractNumber()
		// method to show sort options

	public static void sortOptions() {
		System.out.println("** How would you like to sort the events?");
		System.out.println("** Choose 1 - Event Number");
		System.out.println("** Choose 2 - Number of Guest");
		System.out.println("** Choose 3 - Event Type");
		System.out.println("** Choose -1 - Exit\n");
	}

	// method to take user input for number of guest
	public static int numberOfGuest() {
		System.out.println("How many guest?");
		Scanner scan = new Scanner(System.in);
		int guest = scan.nextInt();

		while (guest < 5 || guest > 100) {
			System.out.println("Please try again..");
			guest = scan.nextInt();
		}
		return guest;
	}

	// method to take user input for event type
	public static int eventTypePrompt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter event type");
		int event = scan.nextInt();

		while (event < 0 || event > 5) {
			System.out.println("Please try again..");
			event = scan.nextInt();
		}
		return event;
	}

	public static int setEntree() {
		int entree;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select dinner options");
		System.out.println("** Entrees");
		System.out.println("** 0. Salmon");
		System.out.println("** 1. Steak");
		System.out.println("** 2. Chicken");
		return entree = scan.nextInt();
	}

	public static int setSides() {
		int side1;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select side 1 options");
		System.out.println("** Entrees");
		System.out.println("** 0. Mashed Potatoes");
		System.out.println("** 1. Broccoli");
		System.out.println("** 2. Mac & Cheese");
		return side1 = scan.nextInt();
	}

	public static int setSidesTwo() {
		int side2;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select side 2 options");
		System.out.println("** Entrees");
		System.out.println("** 0. Mashed Potatoes");
		System.out.println("** 1. Broccoli");
		System.out.println("** 2. Mac & Cheese");
		return side2 = scan.nextInt();
	}

	public static int setDessert() {
		int dessert;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select dessert options");
		System.out.println("** Entrees");
		System.out.println("** 0. Ice Cream");
		System.out.println("** 1. Cheesecake");
		System.out.println("** 2. Cookies");
		return dessert = scan.nextInt();
	}

	// method to utilize bubble sort to sort array object
	public static void bubbleSort(Event[] e, int userInput) {

		int a, b;
		Event temp;
		int highSubscript = e.length - 1;

		switch (userInput) {
		case 1:
			System.out.println("** Sorting by Event Number ascending...\n");
			for (a = 0; a < highSubscript; ++a) {
				for (b = 0; b < highSubscript; ++b) {
					if (e[b].getEventNumber().compareTo(e[b + 1].getEventNumber()) > 0) {
						temp = e[b];
						e[b] = e[b + 1];
						e[b + 1] = temp;
					}
				}
			}
			break;
		case 2:
			System.out.println("** Sorting by Number of Guest ascending...\n");
			for (a = 0; a < highSubscript; ++a) {
				for (b = 0; b < highSubscript; ++b) {
					if (e[b].getNumberOfGuest() > e[b + 1].getNumberOfGuest()) {
						temp = e[b];
						e[b] = e[b + 1];
						e[b + 1] = temp;
					}
				}
			}
			break;
		case 3:
			System.out.println("** Sorting by Event Type ascending...\n");
			for (a = 0; a < highSubscript; ++a) {
				for (b = 0; b < highSubscript; ++b) {
					if (e[b].getEventType() > e[b + 1].getEventType()) {
						temp = e[b];
						e[b] = e[b + 1];
						e[b + 1] = temp;
					}
				}
			}
			break;
		}
	}
	/*
	 * public static Event compareEvents(Event e1, Event e2) {
	 * if(e1.getNumberOfGuest() > e2.getNumberOfGuest()) { return e1; } else{ return
	 * e2; } }
	 */
}
