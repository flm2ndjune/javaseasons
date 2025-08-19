package arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		String[] s=new String[5];
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		s[2]="FLM";
		s[3]="Selenium";
		s[4]="java";
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		

	}

}
