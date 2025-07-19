package methods;

import java.util.Scanner;

public class Calc {
	
	//1) No return-type and no arguments
	public void natSum1()
	{
		System.out.println("Enter a natural number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("Sum of "+n+" natural numbers is "+(n*(n+1)/2));
		input.close();
	}
	
	//2) No return-type and arguments
	public void natSum2(int n)
	{
		System.out.println("Sum of "+n+" natural numbers is "+(n*(n+1)/2));
	}
	
	//3) return-type and no arguments
	
	public int natSum3()
	{
		System.out.println("Enter a natural number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=n*(n+1)/2;
		input.close();
		return sum;
	
		
	}
	
	//4) return-type and arguments
	public int natSum4(int n)
	{
		
		return n*(n+1)/2;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
