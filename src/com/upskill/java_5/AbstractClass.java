package com.upskill.java_5;

public abstract class AbstractClass {
	
	//Three types of class - Class, Abstract Class & Interface
	//Regular Class - Only regular methods
	//*Abstract class* - has both Abstract methods & Regular Methods
	//Interface Class - Only abstract methods

	public void car(){
		System.out.println("My car is Pathfinder");
	}
	
	public abstract void iDoor();
	
	public abstract void iWheel();
	
	public abstract void iEngine();
	
	public int Boat(){
		return 5;
	}
	
	public String Color(){
		return "Red";
	}
	
    public abstract int iSail();
	
	public abstract String iCabin();
}
