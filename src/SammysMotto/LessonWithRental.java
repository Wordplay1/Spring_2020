package SammysMotto;

/* @Author: Donald Mears
 * Title: LessonWithRental.java
 * Description: LessonWithRental is subclass of Rental
 * 
 * 
 * 
 */

public class LessonWithRental extends Rental{
	
	private boolean lessonRequired = false;
	private int equipment;
	
	//String Array to hold instructor names
	private final String[] instructors = {"Pam","John","Don","Jessica","Sheryl","Tom","Phil","Zach","Jose"};
	
	//Constructor pulls two parameters from Rental superclass
	public LessonWithRental(String eventNum, int minutesRented, int equipmentType) {
		super(eventNum,minutesRented);
		equipment = equipmentType;
		if(equipment == 0 || equipment == 1) {
			lessonRequired = true;
		}
	}
	//getInstructor() method to print instructor results to user
	public void getInstructor() {
		if(lessonRequired) {
			System.out.println("Instructor is " + instructors[equipment]);
			System.out.println("Lesson is required \n");
		}else {
			System.out.println("Instructor is " + instructors[equipment] + "\n");
		}
	}
	//getEquipmentType() Override method to return equipment type
	@Override
	public int getEquipmentType() {
		return equipment;
	}
	
	//getEquipmentName() Override method to return equipment name
	@Override
	public String getEquipmentName() {
		if(equipment >= equipmentNames.length) {
			equipment = equipmentNames.length - 1;
		}
		return equipmentNames[equipment];
	}
	
}
