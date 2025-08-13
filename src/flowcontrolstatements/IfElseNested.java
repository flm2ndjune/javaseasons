package flowcontrolstatements;

import java.util.Scanner;

public class IfElseNested {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter your Dept ");
		Scanner input1=new Scanner(System.in);
		String dept=input1.next();
		
		System.out.println("enter your salary ");
		Scanner input2=new Scanner(System.in);
		double sal=input2.nextDouble();
		
		//nested if else 
		if(dept.equalsIgnoreCase("non-it"))
		{
			//code for non-it dept
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
			
			System.out.println("your sal for this month is "+sal);
			
		}
		else if(dept.equalsIgnoreCase("it"))
		{
			//code for it 
			if(sal > 0 && sal <=10000)
			{
				sal=sal+(sal*0.2);
			}
			else if(sal > 10000 && sal <=20000)
			{
				sal=sal+(sal*0.3);
			}
			else if(sal > 20000 && sal <=30000)
			{
				sal=sal+(sal*0.4);
			}
			else 
			{
				sal = sal+(sal*0.5);
			}
			
			System.out.println("your sal for this month is "+sal);
		}
		else
		{
			System.out.println("Entered wrong dept..please check it ..");
		}
		
		
	}
	
	

}
