package searchingandsorting;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		//using temp or third  variable
		
		int temp=0;
		
		temp=a;
		
		a=b;
		
		b=temp;
		
		System.out.println("After swapping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		
		

	}

}
