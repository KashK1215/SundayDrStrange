package com.upskill.java_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;


public class Array_Hashmap_Hashset_HashTable {	

	public static void main(String[] args) {
		
		//Array store multiple data using index
		int age = 30;                                      //Variable
		int[] ageVision = new int[]{21, 26, 28, 30, 35};   //Array
		
		//Array index                [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageVision[2]);
		System.out.println("Total student : " + ageVision.length);
		
		String[] nameVision = new String[]{"Ayesha", "Kash", "Jenny", "Liza", "Liya"};
		
		System.out.println("Student Name : " + nameVision[1]);
		System.out.println("Total Student Name : " + nameVision.length);
		
		// HashMap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer> ();
		
		Student.put("Ayesha", 21);
		Student.put("Kash", 26);
		Student.put("Jenny", 28);
		Student.put("Liza", 30);
		Student.put("Liya", 35);
		
		System.out.println("HashMap Student Age : " + Student.get("Jenny"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();	
        
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " +Capital.get("BD"));
		
		//HashTable store multiple data using key-value pair, no duplicate, also is synchronized (only one thread can be modified)
		
		Hashtable<String,String> Region = new Hashtable<String,String> ();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));
		
		//HashSet store unordered collection containing unique value (no duplicates), implementation of set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("Tesla");
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
		
	}
}
