package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 doors");		
	}

	@Override
	public void iWheel() {
		System.out.println("My Car has 4 wheels");		
	}

	@Override
	public void iEngine() {
		System.out.println("My Car has 1 engine");		
	}

	@Override
	public int iSail() {
		System.out.println("My Boat has 1 Sail");
		return 0;
	}

	@Override
	public String iCabin() {
		System.out.println("My Boat has AC cabin");
		return "AC";
	}

}
