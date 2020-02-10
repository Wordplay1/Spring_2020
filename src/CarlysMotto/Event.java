package CarlysMotto;

/**
 * 
 * @author Donald Mears
 * 		   Program Description: Class Event.java to build instances of an Event.
 *
 */
public class Event {
		
		// Declare and initialize unchanged variables.
		public final static double pricePerGuest = 35;
		public final static int eventMax = 50;
		
		//Declare variables that build the event object.
		private String eventNumber;
		private int numberOfGuest;
		private double price;
		
		// setEventNumber methods to set event number
		public void setEventNumber(String event) {
			eventNumber = event;
		}// end setEventNumber()
		
		// setGuest() method to set number of guest
		public void setGuest(int guest) {
			numberOfGuest = guest;
			price = numberOfGuest * pricePerGuest;
		}// end setGuest()
		
		// getEventNumber() to return to event number
		public String getEventNumber() {
			return eventNumber;
		}// end getEventNumber()
		
		//getNumberOfguest() to return number of guest
		public int getNumberOfGuest() {
			return numberOfGuest;
		}// end getNumberOgGuest
		
		// getPrice() to return price
		public double getPrice() {
			return price;
		}// end getPrice()
		
		
}
