package exceptions;

import objectandclass.Person;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		int x=10;
		
		int y=0;
		
		
		
		try
		{
		System.out.println("Quotient is "+x/y);
		System.out.println("Remainder is "+x%y);
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
			//e.printStackTrace();
			//exception handling or user friendly message 
			System.out.println("Please assign non-zero value for y..");
			
		}
		
		
		System.out.println("End of program..");
		
		

	}

}
