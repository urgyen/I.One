package day5;

public class Child extends Father, Mother {

	//state?
	//name
	
//	//state
//	String name;
//	//define when child will earna dn go to work
//	int age;
//	int weight;
//	String address;
//	
//	
//	//behavior?
//	
//	public void earnsMoney() {
//		System.out.println("Earning Money");
//	}
//	
//	public void goesToWork() {
//		System.out.println("Goes to Work");
//	}
	
	public void goesToSchool() {
		
		if(age<18) {
			System.out.println("Goes to School");
		}
		else {
			System.out.println("He doesnt go to school");
		}
		
	}
	
	public void plays() {
		System.out.println("Plays");
	}
	
	
	
}
