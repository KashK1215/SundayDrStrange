package com.upskill.java_2;

public class IfElseStatement {
	
	//Conditional Statement - Unknown data

	public static void main(String[] args) {
		
		int age = 14;
		
		if (age <= 13){
			System.out.println("You are a child");
		} else if (age >13 && age <18){				
			System.out.println("You are a teenager");
		} else if (age >=60){
			if(age >=100){
			    System.out.println("You are a champion");
			}else {
			System.out.println("You are a senior");
			}
		} else {
			System.out.println("You are an adult");
		}
		
	
		
	    int percentage = 93;
		
		if (percentage >= 90){
			System.out.println("Grade: A");
		}  else if (percentage >= 75){
			System.out.println("Grade: B");
		}  else if (percentage >= 65){
			System.out.println("Grade: C");
		}  else {
			System.out.println("Grade: D");
		}
    }	
}

    
    
