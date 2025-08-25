package exceptions;

public class MultipleCatchDemo1 {

	public static void main(String[] args) {
		
		
		int[] numbers= {10,20,30};
		String str=null;
		try
		{
		int result =numbers[1]/10;
		System.out.println(str.length());
		
		System.out.println(result);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Please enter index which is less than length of array..");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Please divide with non-zero number ..");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("generic exception found ..");
		}
		System.out.println("End of program...");

	}

}
