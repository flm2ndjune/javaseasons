package operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		System.out.println("Enter some integer ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
	  //System.out.println(x>=0? m1() :"-ve");
		
		int y= (x>=0) ? m1() : m2();
		
		System.out.println(y);

	}
	
	static int m1()
	{
		System.out.println("Hi ...");
		return 0;
		
	}
	
	static int m2()
	{
		System.out.println("Bye ...");
		return -1;
		
	}

}
