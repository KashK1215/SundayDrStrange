package com.upskill.java_1;

public class Loops {
	
	/*
	Type of Loops
	    1. For Loop
	    2. While Loop
	    3. Do While Loop
	    4. Infinite Loop
 */	

	public static void main(String[] args) {
//      practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practceInfiniteLoop();
		practiceNestedForLoop();
	}
	
	public static void practiceForLoop(){                       //For Loop - Do again and again up to upper limit
		int i ;                                                 //Initialize the variable
		for(i = 1; i <=10; i++){                                //Setting lower limit, Increment or Decrement
			System.out.println("For Loops Number = " + i);      //Statement
		}
	}
	
	public static void practiceWhileLoop(){                     //While Loop(conditional Loop)- Do again and again up to condition match
    	int i = 1 ;                                             //Initialize the Variable
    	while(i<=10){                                           //Setting condition
    		System.out.println("While Loops Number = " + i);    //Statement
    		i++;                                                //Increment or Decrement    		
    	}
    } 
	
	public static void practiceDoWhileLoop(){                   //Do While Loop (also conditional loop)- Do action then match condition
		int i = 1;                                              //Initialize the variable
		do {
			System.out.println("While Loops Number = " + i);    //Statement
			i++;                                                //Increment or Decrement
		} while (i<=0);                                         //checking condition
	}
	
	public static void practceInfiniteLoop(){                   //Infinite Loop - never ending loop
		int i ;                                                 //Initialize the variable
		for (i = 1;  ; i++){                                    //setting no upper limit
			System.out.println("Infinite Loops Number = " + i); //Statement
		}
	}	
	
	public static void practiceNestedForLoop(){                 //one loop inside another loop
		int i;
		int j;
		
		for(i = 1; i <=10; i++){
			for(j = 1; j <=10; j++){
				int multiplicationTable = i * j;
				System.out.print(multiplicationTable + " ");
			}
			System.out.println(" ");
		}
	}
	
 }

