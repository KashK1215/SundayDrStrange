package com.upskill.java_1;

public class Variables {
	
	/* Variables in Java	
	      Local variable - variables declared in methods
	      Instance Or global variable - Variables declared in Class level, outside method
	      Static Variable - variables belong to Class and don't require creating object
	      Method parameter - variables used as method parameter, pass data outside to inside of method */
	 
	public static void main(String[] args) {
		
        Variables obj = new Variables();
        obj.newyork();     
		obj.texas("Burgers");
        System.out.println(obj.country);
        System.out.println(obj.president);       
	}
	
	String country = "USA";   //Instance OR global variable - Variables declared in Class level, outside method
	static String president = "Biden";  //Static variable - variables belong to class and don't require creating object

	
	public static void newyork (){
		String city = "Queens";  //local variable - variables declared in methods
		String police = "NYPD";
		System.out.println(police);
	}
	
	public static void texas (String food){  //method parameter - variables used as method parameter

		String city =  "Austin";
		String police = "APD";	
		System.out.println(police);
		System.out.println(food);
	}		
}
