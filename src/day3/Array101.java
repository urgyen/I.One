package day3;

public class Array101 {


	//String, int, double;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub?
		
		//Array starts with o
		//Array is static
		//Shortcut
		
		String students[]= {"Bipin", "Mohhamad", "Prakash", "Diwas"	};

//		//fetching
//		System.out.println(students[0]);
//		System.out.println(students[1]);
//		System.out.println(students[2]);
//		System.out.println(students[3]);

		
		String student[]= new String[10];
		//push in Array?
		student[0]= "Apple";
		student[1]= "Banana";
		student[2]= "Apple";
		student[3]= "Banana";
		student[4]= "Apple";
		student[5]= "Banana";
		student[6]= "Apple";
		student[7]= "Banana";
		student[8]= "Apple";
		student[9]= "Banana";
		
		//11th data 
		//Array Index out of Bounds
		//student[10]= "Apple";
		
		System.out.println(student.length);
		
//		for(int index=0; index<student.length; index++) {
//			System.out.println(student[index]);
//		}
//		
		//update??
		
		//for each ??
		//data== Apple
		
		for(String data : student) {	
			System.out.println(data);
		}
		
		//Documentation of String doc
	//	student.
		
		
		
	}

}
