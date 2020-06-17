package day4;

public class Student {

	//student have?
	//state of a class
	String name;
	int id;
	String address;
	int yearOfStudy;
	
	//Student do?
	//behavior
	
	public void printDetails() {
		System.out.println(name + "  : "+ id + " : " + address + " : "+ yearOfStudy);
	}
	
	public void studies() {
		System.out.println("Studies ");
	}
	
	public void giveExams() {
		System.out.println("Gives Exmas");
	}
	
}
