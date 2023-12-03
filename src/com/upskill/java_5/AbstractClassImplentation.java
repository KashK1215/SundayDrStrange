package com.upskill.java_5;

public class AbstractClassImplentation extends AbstractClass{

	@Override
	public void iDoor() {
		System.out.println("My car has 4 doors");		
	}

	@Override
	public void iWheel() {
		System.out.println("My car has 4 Wheels");		
	}

	@Override
	public void iEngine() {
		System.out.println("My car has 1 engine");		
	}

	@Override
	public int iSail() {
		System.out.println("My Boat has 1 Sail");
		return 1;
	}

	@Override
	public String iCabin() {
		System.out.println("My boat has AC cabin");
		return "AC";
	}

	
	/*
	(Parent)                   (Keyword)            (Child)                (Keyword)            (Grand child)
	Class[R]                    extends	            Class [R]          
	Abstract Class [R][i]       extends	            Class [R][R] 
	Interface [i]              implements           Class [R]
	Interface [i]               extends           Interface[i][i]          Implements            Class[R][R]
	
	 */
}
