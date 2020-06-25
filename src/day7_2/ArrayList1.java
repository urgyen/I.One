package day7_2;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//definite size;
		//int a[] = new int[10];
		
		//dyanmaic
		ArrayList<String> al= new ArrayList<>();
		al.add("Bipin");
		al.add("Diwas");
		al.add("Mohhamad");
		al.add("Prakash");
		al.add("Bipin");
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(	al.isEmpty());
		
		for(String data : al) {
			System.out.println(data);
		}
		
		
		

	}

}
