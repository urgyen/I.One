package day6_1;

public class Encap101 {

	//Encapsulation
	//Securing our data 
	//USed getter and setter check the logic as well;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StudentDetails s1= new StudentDetails();
		
		//s1.age=10000;
		
		s1.setAge(69);
		System.out.println(s1.getAge());
		
		s1.setGender("Male");
		System.out.println(s1.getGender());
		
	}

}
