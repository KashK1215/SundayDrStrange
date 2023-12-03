package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method

	private String name = "Upskill";       //write & read
	private int ssn = 123456;              //write only
	private String username = "kashkhan";  //read only
	
	
	//setter method - ssn                  //set the data, write
	public void setSSN(int value){
		ssn = value;	
}
        
    //Getter Method - username             //get the data, read
	public String getUserName(){
		return username;
	}
	
	//Setter Method - name                 //set the data, write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name                 //get the date, read
	public String getName(){
		return name;
	}
    
  	public static void main(String[] args) {    	
  		Encapsulation obj = new Encapsulation();
  		System.out.println(obj.getName());
  		System.out.println(obj.getUserName());
  		
  		obj.setName("Jenny");
  		obj.setSSN(546875);
    }
}