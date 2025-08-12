package flowcontrolstatements;

import java.util.Scanner;

public class IfElseLadder {
	
	public static void main(String[] args) {
		
		System.out.println("enter your salary ");
		Scanner input=new Scanner(System.in);
		double sal=input.nextDouble();
		
		//if-else-if ladder 
		
		if(sal > 0 && sal <=10000)
		{
			sal=sal+(sal*0.1);
		}
		else if(sal > 10000 && sal <=20000)
		{
			sal=sal+(sal*0.2);
		}
		else if(sal > 20000 && sal <=30000)
		{
			sal=sal+(sal*0.3);
		}
		else 
		{
			sal = sal+(sal*0.4);
		}
		
		System.out.println("your salary for this month is "+sal);
		
	}

}
