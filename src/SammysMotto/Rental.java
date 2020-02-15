package SammysMotto;

public class Rental {
	
	// final static variables that wont change
	public final static int rate_hours = 60;
	public final static double rate = 40.0;
	
	// private variables that will build the Rental object
	private String contractNum;
	private int hoursRented;
	private int minutesOver;
	private double price;

	
	public Rental() {
		this("A000",0);
	}
	public Rental(String contractNum, int numOfMins) {
		setContractNumber(contractNum);
		setHoursAndMinutes(numOfMins);
	}
	
	// setContractNumber method to set contract number
	public void setContractNumber(String contract) {
		contractNum = contract;
	}// end setContractNumber
	
	// setHoursAndMinutes to set hours and minutes
	public void setHoursAndMinutes(int minutes) {
		hoursRented = minutes / rate_hours;
		minutesOver = minutes - hoursRented * rate_hours;
		price = hoursRented * rate + minutesOver;
		
	}// end setHoursAndMinutes()
	
	// method to get contract number
	public String getContractNumber() {
		return contractNum;
	}// end getContractNumber()
	
	// method to get hours rented
	public int getHoursRented() {
		return hoursRented;
	}// end getHoursRented()
	
	// method to get minutes over
	public int getMinutesOver() {
		return minutesOver;
	}// end minutesOver()
	
	// method to get price
	public double getPrice() {
		return price;
	}// end getPrice()
}

