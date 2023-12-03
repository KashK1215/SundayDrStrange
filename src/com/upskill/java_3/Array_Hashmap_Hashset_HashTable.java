package com.upskill.java_3;

public class Array_Hashmap_Hashset_HashTable {
	
	public static void main(String[]args){
		
		//Array store multiple data using index
		
		int age = 30;
		int[]ageDrStrange = new int[]{25, 21, 30, 35, 28};
		
		//Array index                 [0] [1] [2] [3] [4]
		
		System.out.println(age);
		System.out.println(ageDrStrange[4]);
		System.out.println(ageDrStrange.length);
		
		String[] nameDrStrange = new String[]{"Sabbir", "Mehran", "Rifath", "Rayan", "Rafidh", "Safwan"};
		System.out.println(nameDrStrange[3]);
		System.out.println(nameDrStrange.length);
		
		//Multi-Dimentional Array
		int [][] ageDrStrange2D = {{25, 21, 30, 35, 28},   //[0][0] [0][1] [0][2] [0][3] [0][4]
		                           {31, 32, 25}};		   //[1][0] [1][1] [1][2]
		
		System.out.println(ageDrStrange2D[0][3]);
	}
}
