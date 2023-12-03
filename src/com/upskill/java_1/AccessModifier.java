package com.upskill.java_1;

public class AccessModifier {
	
	public String name = "Kash";            // public - Any class can access
	
	private int age = 35;                   //private - Only same class can access
	
	protected int ssn = 123456;             //protected - classes in the same package and subclass
	
	  String address = "Northeast Philly";  // default - classes in same package only can access

}
