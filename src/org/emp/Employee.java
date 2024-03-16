package org.emp;

public class Employee {

	private void empId() {
	System.out.println("Employee Id is 201");
	}
	
	private void empName() {
    System.out.println("Employee name is Raaj");
	}
	
	private void empDob() {
	System.out.println("Employee Dob is 01\01\1998");
	}
	
	private void empphone() {
	System.out.println("Employee phone is 9876543210");
	}
	
	private void empEmail() {
    System.out.println("Employee email is abc@gmail.com");
	}
	
	private void empAddress() {
	System.out.println("Employee adaress is Dhandeswaran Nagar velacherry");
	}
	
	public static void main(String[] args) {
	
	Employee e= new Employee();
	
	e.empId();
	e.empName();
	e.empDob();
	e.empphone();
	e.empEmail();
	e.empAddress();
	
	System.out.println("Work Done By Dev");
	System.out.println("Dev Done");
	
	System.out.println("Work Done By QA");
	System.out.println("QA Done");

	}
	
}
