package day4_1;

public class Country {
	
	//state
	//What country has.
	String name;
	double area;
	double noOfPopulation;
	String currency;
	
	//behaviour
	//what does country do?
	
	public void protectsTheBorder() {	
		System.out.println("Army protects Border");
	}
	
	public void checkThePopulation() {
		if(noOfPopulation>100000) {
			System.out.println("Over Population");
		}
		else {
			System.out.println("Finely Populated.");
		}
	}

	public void takesTax() {
		System.out.println("Taxes People");
	}
	
	public void printDetails() {
		System.out.println("Name of Country: "+ name);
		System.out.println("Area of Country: "+ area);
		System.out.println("Population of Country: "+ noOfPopulation);
		System.out.println("Currency of Country: "+ currency);
		System.out.println("-------");

	}
	

}
