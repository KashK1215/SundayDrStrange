package com.upskill.java_5;

public class Exception_TryCatchFinale {
	
	/*Java Exceptions - Use "try -catch - finally"
	 * 
	   A. Built-in Exceptions throws by java which explain certain error situations.
	      1. ArithmeticException - error has occurred in an arithmetic operation.
	      2. ArrayIndexOutOfBoundsException - an array has been accessed with an illegal index.
	      3. ClassNotFoundException - try to access a class whose definition is not found.
	      4. FileNotFoundException - a file is not accessible or does not open.
	      5. IOException - input-output operation failed or interrupted.
	      6. InterruptedException - thread is waiting, sleeping, or doing some processing, and it is interrupted.
	      7. NoSuchFieldException - class does not contain the field or variable specified.
	      8. NoSuchMethodException - accessing a method which is not found.
	      9. NullPointerException - referring to the members of a null object.
	      10. NumberFormatException - a method could not convert a string into a numeric format.
	      11. RuntimeException - any exception which occurs during runtime.
	      12. StringIndexOutOfBoundsException - String class methods to indicate that an index is either negative or greater than 
	      
	   B. User-defined Exceptions - user can also create exceptions where the error is not covered by Java.
	 */

	public static void main(String[] args) {
		
		//Built-in Exception ArrayIndexOutOfBoundsException
		try{
			int[] ageDrStrange = new int []{25,30, 32,28, 27};
			System.out.println("Student age = " + ageDrStrange[5]);
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("Array Method Complete ! ");
		}
		
		//int[] ageDrStrange = new int []{25,30, 32,28, 27};
		//System.out.println("Student age = " + ageDrStrange[5]);
		
		//Specific Built-in Exceptions - NumberFormatException
		try{
			int num = Integer.parseInt("five");
		} catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("Array Method Complete ! ");
		}
		
		//User-Defined Exceptions
		try{
			throw new KashException("Test");
		} catch (KashException e){
			e.printStackTrace();
			System.out.println("This is User-defined Exceptions method ! ");
		}
		
		finally {
			System.out.println("Test Execution Completed !");
		}
	}
}
