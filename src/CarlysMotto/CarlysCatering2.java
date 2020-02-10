package CarlysMotto;

import javax.swing.JOptionPane;

public class CarlysCatering2 {

	public static void main(String[] args) {
		/* Begin Unit 2 
		 * 
		 * Unit 2 Case 1
		 * 
		 */
			
			//Initialize variables
			double totalPrice = 0;
			int pricePerGuest= 35;
			int eventSizeMax = 50;
			
			//create new scanner object
			//Scanner scanner = new Scanner(System.in);
			
			//prompt for user input
			String numberOfGuest; 
			numberOfGuest = JOptionPane.showInputDialog(null, "Please enter the number of guest attending...");
			int result = Integer.parseInt(numberOfGuest);
			
			//calculate total price
			totalPrice = result * pricePerGuest;
			
			//print all results to the user
			System.out.println("Number of guest is: "+ numberOfGuest);
			System.out.println("Price per guest is: "+ pricePerGuest);
			System.out.println("The cost of the party is: $"+ totalPrice);
			
			//check to see event event is large if number of guest >= 50
			if(result >= eventSizeMax) {
				System.out.println("Large event.");
			}
	}

}
