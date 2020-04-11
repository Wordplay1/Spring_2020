package SammysMotto;

/*
 * @author: Donald Mears
 * @title: EquipmentWithLessons.java
 * @description: EquipmentWithLessons class to build EquipmentWithLessons objects extended from equipment
 */

public class EquipmentWithLessons extends Equipment {
	
	// 1st constructor calls super class constructor
	public EquipmentWithLessons(int eType) {
		super(eType);
		
	}
	//Overridden method from Equipment class to return lesson policy
	@Override
	public String getLessonPolicy() {
		String lessonPolicy = "";
		lessonPolicy += "Lesson is required, fee is: " + equipmentSurcharge[this.getEquipmentType()];
		return lessonPolicy;
	}

}
