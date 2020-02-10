package Project1;

import java.util.Scanner;

/*
 * Author: Donald Mears
 * Program Description: Program will take inputs for Fahrenhiet, convert to Celsius and print the results. 
 * 						Program will also take input for Celsius, convert to Fahrenheit, and print the results.
 */

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		
		// Declare and initialize variables for Celsius and Fahrenheit
		double celsius;
		double fahrenheit;
		
		// Declare and initialize scanner to take in user input
		Scanner scan = new Scanner(System.in);
		
		// prompt to ask user for temperature in fahrenheit and save in memory
		System.out.println("Please enter temp in Fahrenheit");
		fahrenheit = scan.nextDouble();
		
		// Algorithm to convert fahrenheit to celsius 
		celsius = ((fahrenheit - 32.0) * (5.0/9.0));
		
		//print fahrenheit to celsius results
		System.out.println(fahrenheit + " degress in fahrenheit temperature "
				+ "converted to celsius is: " + celsius);
		
		// prompt to ask user for temperature in celsius and save in memory
		System.out.println("Please enter temp in Celsius");
		celsius = scan.nextDouble();
				
		// Algorithm to convert fahrenheit to celsius 
		fahrenheit = ((celsius * (9.0/5.0)) + 32.0);
				
		//print celsius to fahrenheit results
		System.out.println(celsius + " degress in celsius temperature converted to "
				+ "fahrenheit is: " + fahrenheit);
	}

}
