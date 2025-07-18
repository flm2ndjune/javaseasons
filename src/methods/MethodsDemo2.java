package methods;

import java.util.Scanner;

public class MethodsDemo2 {

	public void greet()
	{
		Scanner obj1=new Scanner(System.in);
		String name1=obj1.next();
		System.out.println("hi "+name1+"..");
		System.out.println("how are you ???");
		System.out.println("Good evening ...");
	}
	public static void main(String[] args) {
		
	
		MethodsDemo2 a1=new MethodsDemo2();
		a1.greet();
		a1.greet();
		a1.greet();
		
		}
	
	

}
