package day7_2;

import java.util.HashSet;

public class HashSet1 {

	//hashing?
	
	public static void main(String[] args) {
		
	HashSet<String> set1= new HashSet();
	set1.add("Apple");
	set1.add("Bat");
	set1.add("Dog");
	set1.add("Dog");
	set1.add("Cat");
	set1.add("Egg");
	set1.add("Fish");
	set1.add("Gun");
	set1.add("Hen");
	set1.add("Ice");
	set1.add(null);


	System.out.println(set1);
	
	}
}
