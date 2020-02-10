package CarlysMotto;

import java.util.Scanner;


public class CarlysCatering {

	public static void main(String[] args) {
		
		/* Begin Unit 2 
		 * 
		 * Unit 2 Case 1
		 * 
		 * */
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of guest attending");
		
		int numberOfGuest = scanner.nextInt();
		
		double pricePerPerson = 35;
		
		double cost = numberOfGuest * pricePerPerson;
		
		System.out.println("The cost of the party will be $"+ cost);
		
		if(numberOfGuest >= 50) {
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
