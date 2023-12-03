package com.upskill.java_2;

import com.upskill.java_1.MethodType;

public class Inheritance extends MethodType{           //First concept of OOPs Java.
	
	/* The process of obtaining the data members and methods from one class to another class is known as Inheritance.
	-   Single Inheritance
	-   Multiple Inheritance   (Java doesn't support Multiple Inheritance directly rather through Interfaces)
	-   Multilevel Inheritance
	
	 */

	public static void main(String[] args) {
		
		weeklyIncomeStatic();
		
		Inheritance obj = new Inheritance();		
		obj.annualIncomeVoid();
		//System.out.println(obj.monthlyIncomeReturn());		
	}
}
