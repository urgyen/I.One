package day4;

public class MainClass {

	//OO in java:
//		1. Object and Class
	
	//Class?
	
		
//		2. Inheritance?
//		3. Polymorphism
//		4. Abstraction
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student diwas= new Student();
		//Putting data
		diwas.name="Diwas 123";
		diwas.id= 1;
		diwas.address="US";
		diwas.yearOfStudy=2;
		
		diwas.printDetails();
		diwas.studies();
		diwas.giveExams();
		
		
		System.out.println( "=======");
		Student mohhamad= new Student();
		mohhamad.name="Mohhamad 123";
		mohhamad.id=2;
		mohhamad.address="US";
		mohhamad.yearOfStudy=3;
		
		mohhamad.printDetails();
		mohhamad.studies();
		mohhamad.giveExams();
		
		
		
		
		
		
	}

}
