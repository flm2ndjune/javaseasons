package flowcontrolstatements;

import java.util.Scanner;

public class WhileLoopDemo3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String uname=null;
		String pwd=null;
		boolean status = false;
		while(status)
		{
			
			System.out.println("Enter username ");
			uname=input.next();
			System.out.println("Enter password ");
			pwd=input.next();
			
			if(uname.equals("reyaz0806") && pwd.equals("reyaz123"))
			{
				System.out.println("Welcome to Search Hotel Page ");
				break;
				
			}
			else
			{
				System.out.println("Invalid Crdentials Entered ..try again..");
			}
		}
		
		
		
		
		System.out.println("End of program...");

	}
	
	

}
