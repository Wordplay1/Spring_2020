package CarlysMotto;

/* @Author: Donald Mears
 * Title: DinnerEvent.java
 * Description: DinnerEvent is subclass of Event
 * 
 * 
 * 
 */

public class DinnerEvent extends Event {

	private int entree;
	private int side1;
	private int side2;
	private int dessert;
	private int eventType;
	private String phoneNumber;

	private final String[] entrees = { "Salmon", "Steak", "Chicken" };
	private final String[] sides = { "Mashed Potatos", "Broccoli", "Mac & Cheese" };
	private final String[] desserts = { "Ice Cream", "Cheesecake", "Cookies" };
	private Employee[] employeeRef = new Employee[15];

	// Constructor pulling three parameters from super class
	public DinnerEvent(String eventNum, int numGuest, int entreeChoice, int sideChoice1, int sideChoice2,
			int dessertChoice, int eType) {
		super(eventNum, numGuest);
		entree = entreeChoice;
		side1 = sideChoice1;
		side2 = sideChoice2;
		dessert = dessertChoice;
		eventType = eType;
	}

	public DinnerEvent(String eventNum, int numGuest, int entreeChoice, int sideChoice1, int sideChoice2,
			int dessertChoice) {
		super(eventNum, numGuest);
		entree = entreeChoice;
		side1 = sideChoice1;
		side2 = sideChoice2;
		dessert = dessertChoice;
		this.setPhone();
		phoneNumber = this.getPhoneNumber();
	}

	// getMenu() prints chosen dinner items back to user
	public void getMenu() {
		if (entree >= entrees.length) {
			entree = entrees.length - 1;
		} else
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

	@Override
	public int getEventType() {
		return eventType;
	}

	@Override
	public String getEventName() {
		if (eventType >= eventNames.length) {
			eventType = eventNames.length - 1;
		}
		return eventNames[eventType];
	}

	public void populateEmpArray(Employee[] obj) {
		employeeRef = obj;
	
	}

	public Object[] returnEmpArray() {
		return employeeRef;
	}
	public void printEventEmployees() {
		System.out.println("** Employees for the event ** \n");
		for (int i = 0; i < employeeRef.length; i++) {
			if(employeeRef[i] != null) {
			System.out.println("Job Title: " + employeeRef[i].getJobTitle());
			System.out.println("Employee ID: " + employeeRef[i].getEmployeeID());
			System.out.println("First Name: " + employeeRef[i].getFirstName());
			System.out.println("Last Name: " + employeeRef[i].getLastName());
			System.out.println("Pay Rate: " + employeeRef[i].getPayRate() + "%\n");
			}else {
				break;
			}
		}
	}

}
