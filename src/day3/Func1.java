package day3;

public class Func1 {

	// 4 type of methods in JAVA;
	// on the basis of return and arguments.

	// 1. Function with no argument and no return type?

	public static void printName(int times) {

		for (int i = 0; i < times; i++) {
			System.out.println(i + " : Hello");
		}
		// no argument
		// return nothing
	}

	// 2. Function with no argument and return type

	public static int addNumbers() {

		int num1 = 55;
		int num2 = 75;

		int sum = num1 + num2;

		return sum;

	}

	// 3. function with argument and no retrn type

	// parameter?
	public static void printName(String name) {

		System.out.println("Hello " + name);

	}

	// 4. Function With Argument and REturn type;
	public static double multiplyNumbers(int a, int b) {
		double multipliedValue = a * b;

		return multipliedValue;

		// return a*b;
	}

	// parameter.
	public static void checkVoterEligibility(int age) {

		if (age >= 18) {
			System.out.println("Allowed To Vote");
		} else {
			System.out.println("Grow Up");
		}
	}

	// recursive Function??
	//n=5
	public static double factorial(int n) {

		if (n != 0) {
			return n * factorial(n - 1);
			
		} 
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(15));
		
		
		// printName(1000);

//		int returnedValue = addNumbers();
//		System.out.println(returnedValue);

//		System.out.println(addNumbers());

		// printName("Urgyen");

		// multiplyNumbers(15, 30);

		// System.out.println(multiplyNumbers(14, 25));

		// argument
		checkVoterEligibility(18);

	}

}
