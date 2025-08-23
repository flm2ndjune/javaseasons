package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException  {
		
		System.out.println("Hello World ..");
		
		Thread.sleep(3000);
		
		FileInputStream fis= new FileInputStream("D:\\FLM2ndJune\\abc.txt");
		
		int x=10;
		
		int y=2;
		
		System.out.println("Sum is "+(x+y));

	}

}
