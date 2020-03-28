package CarlysMotto;

public class DinnerEvent extends Event {
	
	private int entree;
	private int side1;
	private int side2;
	private int dessert;
	
	private final String[] entrees = {"Salmon","Steak","Chicken"};
	private final String[] sides = {"Mashed Potatos","Broccoli","Mac & Cheese"};
	private final String[] desserts = {"Ice Cream", "Cheesecake","Cookies"};
	
	public DinnerEvent(String eventNum, int numGuest, int entreeChoice, int sideChoice1, int sideChoice2, int dessertChoice) {
		super(eventNum,numGuest);
		entree = entreeChoice;
		side1 = sideChoice1;
		side2 = sideChoice2;
		dessert = dessertChoice;
	}
	
	public void getMenu() {
		if (entree >= entrees.length) {
			entree = entrees.length - 1;
		}
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
		System.out.println("Dessert is: " + desserts[dessert]);
	}
}
