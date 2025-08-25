package exceptions;

import java.util.Scanner;

public class VoterRegisterApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to voting website ..");
		System.out.println("Enter your details ...");
		System.out.println("Enter your age ");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		if(age>=18)
		{
			System.out.println("Please proceed with registraiton..");
		}
		else
		{
			//System.out.println("Not eligible for voting ..");
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
			
		}

		System.out.println("End of program...");
	}

}
