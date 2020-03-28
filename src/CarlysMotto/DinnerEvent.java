package CarlysMotto;

import java.util.Scanner;

public class DinnerEvent extends Event {
	
	private int entree;
	private int side1;
	private int side2;
	private int dessert;
	
	private final String[] entrees = {"Salmon","Steak","Chicken"};
	private final String[] sides = {"Mashed Potatos","Broccoli","Mac & Cheese"};
	private final String[] desserts = {"Ice Cream", "Cheesecake","Cookies"};
	
	public DinnerEvent(String eventNum, int numGuest, int eventType, int entreeChoice, int sideChoice1, int sideChoice2, int dessertChoice) {
		super(eventNum,numGuest,eventType);
		entree = entreeChoice;
		side1 = sideChoice1;
		side2 = sideChoice2;
		dessert = dessertChoice;
	}
	
	public void getMenu() {
		if (entree >= entrees.length) {
			entree = entrees.length - 1;
		}else
		System.out.println("Entree is: " + entrees[entree]);
		
		if (side1 >= sides.length) {
			side1 = sides.length - 1;
		}
		System.out.println("Side 1 is: " + sides[side1]);
		
		if (side2 >= sides.length) {
			side2 = sides.length - 1;
		}
		System.out.println("Side 2 is: " + sides[side2]);
		
		if (dessert >= desserts.length) {
			dessert = desserts.length - 1;
		}
		System.out.println("Dessert is: " + desserts[dessert] + "\n");
	}
	
	public void setEntree() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select dinner options");
		System.out.println("** Entrees");
		System.out.println("** 1. Salmon");
		System.out.println("** 2. Steak");
		System.out.println("** 3. Chicken");
		entree = scan.nextInt();
	}
	
	public void setSides() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select side 1 options");
		System.out.println("** Entrees");
		System.out.println("** 1. Mashed Potatoes");
		System.out.println("** 2. Broccoli");
		System.out.println("** 3. Mac & Cheese");
		side1 = scan.nextInt();
		
		System.out.println("\nPlease select side 2 options");
		System.out.println("** Entrees");
		System.out.println("** 1. Mashed Potatoes");
		System.out.println("** 2. Broccoli");
		System.out.println("** 3. Mac & Cheese");
		side2 = scan.nextInt();
	}
	public void setDessert() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease select dessert options");
		System.out.println("** Entrees");
		System.out.println("** 1. Ice Cream");
		System.out.println("** 2. Cheesecake");
		System.out.println("** 3. Cookies");
		side2 = scan.nextInt();
	}
}
