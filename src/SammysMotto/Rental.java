package SammysMotto;

public class Rental {
	
	// final static variables that wont change
	public final static int hours = 60;
	public final static double rate = 40.0;
	
	// private variables that will build the Rental object
	private String contractNum;
	private int hoursRented;
	private int minutesOver;
	private double price;
	
	// setContractNumber method to set contract number
	public void setContractNumber(String contract) {
		contractNum = contract;
	}// end setContractNumber
	
	// setHoursAndMinutes to set hours and minutes
	public void setHoursAndMinutes(int minutes) {
		if(minutes <= 60) {
			minutesOver = 0;
			price = rate;
		}
		else {
			minutesOver = minutes - hours;
			price = rate;
			while(minutesOver > 0) {
				price = price + 1.0;
				minutesOver--;
			}
		}
		hoursRented = minutesOver + minutes;
		
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

