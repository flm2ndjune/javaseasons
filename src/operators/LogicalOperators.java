package operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.println("Enter some value for x ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		System.out.println(!(x>0 && x<10));

	}

}
