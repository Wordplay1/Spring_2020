package CarlysMotto;
/*
 	Name: Don Mears
 	Program Description: Prints Carlys motto surrounded by astericks
 */

import java.util.Scanner;

public class CarlysMotto2 {

	public static void main(String[] args) {
		/* Begin Unit 1 
		 * 
		 * Unit 1 Case 2
		 * 
		 * */
		
		// TODO Auto-generated method stub
		System.out.println("***************************************************");
		System.out.println("** Carly’s makes the food that makes it a party. **");
		System.out.println("***************************************************\n\n");
		
		/* Begin Unit 2 
		 * 
		 * Unit 2 Case 1
		 * 
		 * */
		
		//Initialize variables
		int numberOfGuest = 0;
		double totalPrice = 0;
		int pricePerGuest= 35;
		int eventSizeMax = 50;
		
		//create new scanner object
		Scanner scanner = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Please enter the number of guest attending...");
		numberOfGuest = scanner.nextInt();
		
		//calculate total price
		totalPrice = numberOfGuest * pricePerGuest;
		
		//print all results to the user
		System.out.println("Number of guest is: "+ numberOfGuest);
		System.out.println("Price per guest is: "+ pricePerGuest);
		System.out.println("The cost of the party is: $"+ totalPrice);
		
		//check to see event event is large if number of guest >= 50
		if(numberOfGuest >= eventSizeMax) {
			System.out.println("Large event.");
		}
		
		/* Begin Unit 2 
		 * 
		 * Unit 2 Case 2
		 * 
		 * */
		
		
		
		scanner.close();

	}

}
