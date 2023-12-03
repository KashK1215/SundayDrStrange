package com.upskill.java_1;

public class MethodType {
	
	/*  Types of Methods
	  
	 1.Void Method         - Void keyword, it doesn't return any value
	 2.Static Method       - Static keyword, method belong to class and don't require creating object
	 3.Return Type Method  - Have to return data which is declared while creating method
 */

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();	
		
		weeklyIncomeStatic();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		System.out.println(name());
	}

	public static int hourlyIncome = 65;
	
	//void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);		
	}
	
	//static method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);		
 }
	
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public static String name(){
		return "Kash";
	}
}