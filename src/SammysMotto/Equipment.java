package SammysMotto;
/*
 * @author: Donald Mears
 * @title: Equipment.java
 * @description: Equipment abstract class to build Equipment objects
 */
public abstract class Equipment {
	
	private int equipmentType;
	private String equipName;
	private double rentalFee;
	
	private final String [] equipmentNames = {"personal watercraftski","pontoon boat","rowboat","canoe","kayak","beach chair","umbrella","other"};
	protected final double [] equipmentSurcharge = {50.0, 40.0, 15.0, 12.0, 10.0, 2.0, 1.0, 0};
	
	// 1st constructor
	public Equipment(int eqType) {
		if(eqType > 7) {
			equipmentType = equipmentNames.length;
			rentalFee = equipmentSurcharge[equipmentType];
		}else
			equipmentType = eqType;
			rentalFee = equipmentSurcharge[equipmentType];
			
		setEquipmentName();
	}
	// method to set equipment type
	public void setEquipmentType(int eqType) {
		equipmentType = eqType;
	}
	// method to set equipment name
	public void setEquipmentName() {
		equipName = equipmentNames[equipmentType];
	}
	// method to set rental fee
	public void setRentalFee() {
		rentalFee = equipmentSurcharge[equipmentType];
	}
	// method to get equipment type
	public int getEquipmentType() {
		return equipmentType;
	}
	// method to get equipment name
	public String getEquipmentName() {
		return equipName;
	}
	// method to get rental fee
	public double getRentalFee() {
		return rentalFee;
	}
	// abstract method to be added to chilc classes
	// method will return lesson policy
	public abstract String getLessonPolicy();
}
