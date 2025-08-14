package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String uname;
		String pwd;
		boolean status = false;
		do {
			
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
		}while(status);
		
		System.out.println("End of program...");

	}
	
	

}
