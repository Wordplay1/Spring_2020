package CarlysMotto;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @Author: Donald Mears
 * Title: DinnerEventDemo.java
 * Description: DinnerEventDemo to test DinnerEvent.java class.
 * 
 * 
 * 
 */

public class StaffDinnerEvent {

	public static void main(String[] args) {

		/*
		 * START MODULE 10
		 * 
		 * 
		 * 
		 * //declare variables needed to form Dinner Event String eventNum; int
		 * guestNum; int entree; int side1; int side2; int dessert; int eventType;
		 * 
		 * // Declare 4 DinnerEvent objects DinnerEvent[] d = new DinnerEvent[4];
		 * 
		 * //create 4 DinnerEvent objects for (int i = 0; i < d.length; i++) { eventNum
		 * = eventNumber(); guestNum = numberOfGuest(); eventType = eventTypePrompt();
		 * entree = setEntree(); side1 = setSides(); side2 = setSidesTwo(); dessert =
		 * setDessert(); d[i] = new DinnerEvent(eventNum, guestNum, entree, side1,
		 * side2, dessert, eventType); d[i].getMenu(); }
		 */
		String eventNum;
		int guestNum;
		int entree;
		int side1;
		int side2;
		int dessert;
		int waitstaff;
		int bartenders;
		int i;
		Employee[] emp = new Employee[15];

		eventNum = eventNumber();
		guestNum = numberOfGuest();
		entree = setEntree();
		side1 = setSides();
		side2 = setSidesTwo();
		dessert = setDessert();

		DinnerEvent d = new DinnerEvent(eventNum, guestNum, entree, side1, side2, dessert);

		waitstaff = (guestNum / 10) + 1;
		for (i = 0; i < waitstaff; i++) {
			emp[i] = getWaitStaff();
		}

		bartenders = (guestNum / 25) + 1;
		for (; i < waitstaff + bartenders; ++i)
			emp[i] = getBartenders();
		emp[i] = getCoordinator();
		d.populateEmpArray(emp);
		++i;



		displayEventDetails(d);

		/*
		 * sortOptions(); Scanner scan = new Scanner(System.in); int userInput =
		 * scan.nextInt();
		 * 
		 * // while loop for user input validation while (userInput > 3) { try {
		 * System.out.println("Must be between -1,1,2,3"); userInput = scan.nextInt(); }
		 * catch (InputMismatchException r) {
		 * System.out.println("Invalid, please enter an integer"); scan.nextLine(); } }
		 * 
		 * while (userInput != -1) { bubbleSort(d, userInput);
		 * 
		 * // list Event objects sorted for (int i = 0; i < d.length; i++) {
		 * System.out.println("Event Num: " + d[i].getEventNumber());
		 * System.out.println("Guest Num: " + d[i].getNumberOfGuest());
		 * System.out.println("Event type: " + d[i].getEventType());
		 * System.out.println("Event name: " + d[i].getEventName()); d[i].getMenu(); }
		 * // Prompt user again for sorting options sortOptions(); userInput =
		 * scan.nextInt(); while (userInput > 4 || userInput < -1) { try {
		 * System.out.println("Must be between -1,1,2,3"); userInput = scan.nextInt(); }
		 * catch (InputMismatchException r) {
		 * System.out.println("Invalid, please enter an integer"); scan.nextLine(); } }
		 * 
		 * }
		 */
		System.out.print("Exiting Program...");
	}

	public static void displayEventDetails(DinnerEvent d) {
		System.out.println("** Event details **\n");
		System.out.println("Phone Number: " + d.getPhoneNumber());
		System.out.println("Event Number: " + d.getEventNumber());
		System.out.println("Guest Number: " + d.getNumberOfGuest() + "\n");
		
		System.out.println("** Menu Includes **\n");
		d.getMenu();
		d.printEventEmployees();
	}

	public static Waitstaff getWaitStaff() {
		Scanner scan = new Scanner(System.in);
		Waitstaff waiter = new Waitstaff();
		System.out.println("Please enter Waiter/Watress employeeID number");
		waiter.setEmployeeID(scan.nextLine());
		System.out.println("Please enter Waiter/Watress first name");
		waiter.setFirstName(scan.nextLine());
		System.out.println("Please enter Waiter/Watress last name");
		waiter.setLastName(scan.nextLine());
		System.out.println("Please enter Waiter/Watress pay rate");
		waiter.setPayRate(scan.nextDouble());
		return waiter;
	}

	public static Bartender getBartenders() {
		Scanner scan = new Scanner(System.in);
		Bartender bartenders = new Bartender();
		System.out.println("Please enter bartender's employeeID number");
		bartenders.setEmployeeID(scan.nextLine());
		System.out.println("Please enter bartender's first name");
		bartenders.setFirstName(scan.nextLine());
		System.out.println("Please enter bartender's last name");
		bartenders.setLastName(scan.nextLine());
		System.out.println("Please enter bartender's pay rate");
		bartenders.setPayRate(scan.nextDouble());
		return bartenders;
	}

	public static Coordinator getCoordinator() {
		Scanner scan = new Scanner(System.in);
		Coordinator coordinators = new Coordinator();
		System.out.println("Please enter coordinator's employeeID number");
		coordinators.setEmployeeID(scan.nextLine());
		System.out.println("Please enter coordinator's first name");
		coordinators.setFirstName(scan.nextLine());
		System.out.println("Please enter coordinator's last name");
		coordinators.setLastName(scan.nextLine());
		System.out.println("Please enter coordinator's pay rate");
		coordinators.setPayRate(scan.nextDouble());
		return coordinators;
	}

	/*
	 * // eventNumber() method to set event number from user input public static
	 * void displayResults(Event event, String eventNum, int numberOfGuest, double
	 * price, String phoneNumber) {
	 * 
	 * // Convert first letter to capital if lowercase String s1 =
	 * event.getEventNumber(); s1 = s1.substring(0, 1).toUpperCase() +
	 * s1.substring(1).toLowerCase();
	 * 
	 * System.out.println("Event event number is " + s1);
	 * System.out.println("Number of guest is " + numberOfGuest);
	 * System.out.println("Phone number is: " + phoneNumber); if (event.isLarge()) {
	 * System.out.println("Event is large");
	 * System.out.println("Price per person is " + Event.highPricePerGuest); } else
	 * System.out.println("Price per person is " + Event.lowPricePerGuest);
	 * System.out.println("Price is " + price + "\n\n"); // String event =
	 * scan.nextLine();
	 * 
	 * for(int i = 0; i < numberOfGuest; i++) {
	 * System.out.println("Please come to my event!"); }
	 * 
	 * }// end eventNumber()
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

	// setEntree() method to get entree from user
	public static int setEntree() {
		int entree;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select dinner options");
		System.out.println("** Entrees");
		System.out.println("** 0. Salmon");
		System.out.println("** 1. Steak");
		System.out.println("** 2. Chicken");
		entree = scan.nextInt();
		return entree;
	}

	// setSides() method to get side1 from user
	public static int setSides() {
		int side1;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select side 1 options");
		System.out.println("** Entrees");
		System.out.println("** 0. Mashed Potatoes");
		System.out.println("** 1. Broccoli");
		System.out.println("** 2. Mac & Cheese");
		side1 = scan.nextInt();
		return side1;
	}

	// setSidesTwo() method to get side2 from user
	public static int setSidesTwo() {
		int side2;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select side 2 options");
		System.out.println("** Entrees");
		System.out.println("** 0. Mashed Potatoes");
		System.out.println("** 1. Broccoli");
		System.out.println("** 2. Mac & Cheese");
		side2 = scan.nextInt();
		return side2;
	}

	// setDessert() method to get dessert from user
	public static int setDessert() {
		int dessert;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select dessert options");
		System.out.println("** Entrees");
		System.out.println("** 0. Ice Cream");
		System.out.println("** 1. Cheesecake");
		System.out.println("** 2. Cookies");
		dessert = scan.nextInt();
		return dessert;
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
