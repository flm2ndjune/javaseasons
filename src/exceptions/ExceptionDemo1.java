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
		catch(ArithmeticException e) // not preferred to give Exception please specify the exact exception
		//in this case instead of Exception give exact Exception i.e ArtithmeticException
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
