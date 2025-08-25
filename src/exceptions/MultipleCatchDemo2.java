package exceptions;

public class MultipleCatchDemo2 {

	public static void main(String[] args) {
		
		
		int[] numbers= {10,20,30};
		String str=null;
		try
		{
		int result =numbers[2]/0;
		System.out.println(str.length());
		
		System.out.println(result);
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException  | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println("End of program...");

	}

}
