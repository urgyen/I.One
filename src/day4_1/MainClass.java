package day4_1;

public class MainClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Country nepal= new Country();
		nepal.name="Nepal";
		nepal.area= 147518;
		nepal.currency="Nepali";
		nepal.noOfPopulation=125000;
		
		nepal.checkThePopulation();
		nepal.protectsTheBorder();
		nepal.takesTax();
		nepal.printDetails();
		
		System.out.println("--------");
		
		Country usa= new Country();
		usa.name="United States of America";
		usa.area=500000;
		usa.currency="Dollars";
		usa.noOfPopulation= 30000;
		
		usa.checkThePopulation();
		usa.takesTax();
		usa.protectsTheBorder();
		usa.printDetails();
		System.out.println("-------");
		
		Country pakisthan = new Country();
		pakisthan.name="Pakisthan";
		pakisthan.area= 800000;
		pakisthan.currency="Ruppes";
		pakisthan.noOfPopulation=240000;
		
		pakisthan.protectsTheBorder();
		pakisthan.takesTax();
		pakisthan.checkThePopulation();
		pakisthan.printDetails();
		
		System.out.println("-------");
		
		
		
	}

	
				
	}