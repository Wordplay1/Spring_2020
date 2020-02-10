package Project1;

import java.util.Scanner;

/*
 * Author: Donald Mears
 * Program Description: Program prompts user for First and Last name,
 * prints First and Last name together on one line, First name separate on
 * second line, Last name separate on third line.
 */


public class printMyName {
	
	public static void main(String[] args) {
	
	// Declare variables to hold String input for First, Last name
	String firstName;
	String lastName;
	
	// Open scanner for user input
	Scanner scan = new Scanner(System.in);
	
	// Prompt user for first name
	System.out.println("Please enter your first name.");
	firstName = scan.nextLine();
	
	//Prompt user for last name
	System.out.println("Please enter your last name.");
	lastName = scan.nextLine();
	
	// Print First, and Last name to the user
	System.out.println("Your first and last name is \"" + firstName + " " + lastName + "\".");
	System.out.println("Your first name is \"" + firstName + "\".");
	System.out.println("Your last name is \"" + lastName + "\".");
	
	scan.close();
	}
	
}
