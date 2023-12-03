package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	/*Polymorphism is the abilty of an object to take on many forms.	 
	 - Method Overloading (Compile time Polymorphism/Static binding), Same method name	with different signature to overload.                        same method name with different signature to overload.
	 - Method Overriding (Runtime Polymorphism/Dynamic binding), same method name from Parent class to override.	                        same method name from Parent class to override.
	 */
	
	public static void main(String[] args){			
		car();
		car("Black");
		car(4);
		car("Black", 5);
		
		weeklyIncomeStatic();
	}
	
	//Method Overriding (Runtime Polymorphism/Dynamic binding), 
    //same method name from Parent class to override.
	
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		int RealEstateIncome =1400;
		int totalIncome = calculateWeeklyIncome + RealEstateIncome;
		
		System.out.println("My Weekly Income = " + totalIncome);
	}
	
	
	
	//Method Overloading (Compile time Polymorphism/Static binding), 
    //same method name with different signature to overload.
	
	public static void car(){
		System.out.println("My car is Pathfinder");
	}
	
	public static void car(String color){
		System.out.println("My car is Pathfinder, My Pathfinder color : " + color); 	
    }

	 public static void car(int door){
		System.out.println("My car is Pathfinder, My Pathfinder door  : " + door);
	    }
	
	 public static void car(String color, int door){
		 System.out.println("My car is Pathfinder, My Pathfinder color : " + color + ", My Pathfinder door : " + door);
	 }	
}