package CarlysMotto;

import javax.swing.JOptionPane;
/**
 * 
 * @author Donald Mears
 * Program Description: Use methods and outside class Event.java to take user input for number of guest.
 * 						Display Carly's Motto, and calculate the total cost.
 *
 */

public class CarlysEventPriceWithMethods {

	public static void main(String[] args) {
		
		//Declare number of guest variable and initialize/invoke with method getNumberOfUsers()
		int numOfGuest = getNumberOfUsers();
		
		//Invoke displayMotto() method
		displayMotto();
		
		//Invoke calculatePrice() method and pass in numOfGuest
		//calculatePrice(numOfGuest);
		

	}
	// Method getNumberOfUsers
	public static int getNumberOfUsers() {
		
		//Declare variable to hold number of guest
		String numberOfGuest; 
		
		//JOption pane to take in user input and store in variable result
		numberOfGuest = JOptionPane.showInputDialog(null, "Please enter the number of guest attending...");
		int result = Integer.parseInt(numberOfGuest);
		
		//return result
		return result;
	}//end getNumberOfGuest()
	public static void displayMotto() {
		
		//Print out motto to user
		System.out.println("***************************************************");
		System.out.println("** Carly’s makes the food that makes it a party. **");
		System.out.println("***************************************************\n");
		
	}//end displayMotto()
	
	//calculatePrice method
	public static void calculatePrice(Event event) {
		
		//Initialize variables
		double totalPrice = 0;
		double pricePerGuest= Event.pricePerGuest;
		int eventSizeMax = Event.eventMax;
		int guest = event.getNumberOfGuest();
		
		//calculate total price
		totalPrice = guest * pricePerGuest;
		
		//print all results to the user
		System.out.println("Event Number: " + event.getEventNumber());
		System.out.println("Number of guest is: "+ guest);
		System.out.println("Price per guest is: "+ pricePerGuest);
		System.out.println("The cost of the party is: $"+ totalPrice);
		
		//check to see event event is large if number of guest >= 50
		if(guest >= eventSizeMax) {
			System.out.println("Large event.");
		}
		
	}//end calculatePrice

}
