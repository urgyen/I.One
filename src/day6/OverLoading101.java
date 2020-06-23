package day6;

public class OverLoading101 {

	// Poly morphism
		//Method Overloading
		//MEthod Overriding
	
	// Many ways to do one thing

	// Polymorphism in acheived by
//	1. Changing no of arguments
//	2. changing return type
//	
//	public static void addNumber(int a, int b) {
//		int sum= a+b;
//		System.out.println(sum);
//	}
//	
//	public static void addNumber(int a, int b, int c) {
//		int sum= a+b+c;
//		System.out.println(sum);
//	}
//	
//	public static void addNumber(double a, double b) {
//		double sum= a+b;
//		System.out.println("From Third Function : "+ sum);
//	}
//	
//	

	public static void printName(String name1) {
		System.out.println(name1);
	}

	public static void printName(String name1, String name2) {
		System.out.println(name1 + name2);
	}

	public static void printName(int times, String name) {
		
		for(int i=0; i<times; i++) {
			System.out.println(i +" " + name);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// addNumber(5.5, 10);
		// addNumber(5,10, 15);

	//	printName("A");
	//	printName("A", "B");
//		printName(10, "Apple");
		
		
		
		Children c1= new Children();
		//c1.age=15;
		
		c1.earnsMoney(15);
		c1.eats();
		
		

	}

}
