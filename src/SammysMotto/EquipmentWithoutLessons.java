package SammysMotto;

/*
 * @author: Donald Mears
 * @title: EquipmentWithoutLessons.java
 * @description: EquipmentWithoutLessons class to build EquipmentWithoutLessons objects extended from equipment
 */

public class EquipmentWithoutLessons extends Equipment {

	// 1st constructor calls super class constructor
	public EquipmentWithoutLessons(int eType) {
		super(eType);

	}
	
	//Overridden method from Equipment class to return lesson policy
	@Override
	public String getLessonPolicy() {
		String lessonPolicy = "";
		lessonPolicy += "No lesson required";
		return lessonPolicy;
	}

}
