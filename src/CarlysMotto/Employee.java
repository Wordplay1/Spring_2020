package CarlysMotto;

public abstract class Employee {
	private String employeeID;
	private String lastName;
	private String firstName;
	private double payRate;
	private String jobTitle;
	
	public abstract void setpayRate();
	public abstract void setjobTitle();
	
	public void setEmployeeID(String empID) {
		employeeID = empID;
	}
	
	public void setLastName(String lName) {
		lastName = lName;
	}
	
	public void setFirstName(String fName) {
		firstName = fName;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
}
