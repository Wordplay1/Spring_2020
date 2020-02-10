package Project1;

/*
 * Author: Donald Mears
 * Program Description: Program will evaluate expressions with given integer
 * inputs.
 * 
 */

public class Expressions {

	public static void main(String[] args) {
		
		// Declare variables to hold values being evaluated.
		int a, b, c, d, e;
		
		// initialize variables of values to be evaluated
		a = 4;
		b = 6;
		c = 2;
		
		// Perform the calculation
		d = a + b * c;
		
		// Print results
		System.out.println("The result of " + a + " + " + b + " * " + c + " is = " + d);
		
		// initialize variables of values to be evaluated
		a = 10;
		b = 5;
		c = 8;
		
		// Perform the calculation
		d = a / b + c;
		
		// Print results
		System.out.println("The result of " + a + " / " + b + " + " + c + " is = " + d);
		
		// initialize variables of values to be evaluated
		a = 12;
		b = 4;
		c = 16;
		d = 2;
				
		// Perform the calculation
		e = (a / b) + (c / d);
				
		// Print results		
		System.out.println("The result of " + a + " / " + b + " + " + c + " / " + d + " is = " + e);
				
		// initialize variables of values to be evaluated
		a = 25;
		b = 10;
		c = 2;
				
		// Perform the calculation
		d = a - b / c;
		
		//reset e to clear
		e = 0;
				
		// Print results
		System.out.println("The result of " + a + " - " + b + " / " + c + " is = " + d);
		
	}

}
