package searchingandsorting;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		a=a+b;  // a=30
		b=a-b;   //30-20=10
		a=a-b;   //30-10=20
		
		System.out.println("After swapping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		
		

	}

}
