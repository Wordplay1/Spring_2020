package Project1;

/*
 * Author: Donald Mears
 * Program Description: Program takes in 3 integer inputs, compares them to each other,
 * prints the largest of the three numbers to the screen.
 */

public class LargestNumber {

	public static void main(String[] args) {
		// Declare and initialize variables to hold 3 int inputs
		int Num1 = 10;
		int Num2 = 15;
		int Num3 = 20;
		
		// if/else statement to compare 3 numbers agaisn't each other,
		// prints largest number to the screen.
		
		if (Num1 > Num2 && Num1 > Num3)
		      System.out.println(Num1 + "is the largest number.");
		    else if (Num2 > Num1 && Num2 > Num3)
		      System.out.println(Num2 + "is the largest number.");
		    else if (Num3 > Num1 && Num3 > Num2)
		      System.out.println(Num3 + " is the largest number.");
		    else
		      System.out.println("The numbers are not distinct.");
		
	}

}
