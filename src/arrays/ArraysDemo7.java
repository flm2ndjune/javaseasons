package arrays;

public class ArraysDemo7 {

	public static void main(String[] args) {
		
		String[] s=new String[5];
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		s[0]="Abc";
		s[1]="xyz";
		s[2]="FLM";
		s[3]="Selenium";
		s[4]="java";
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		for(String a:s)
		{
			System.out.println(a);
		}
		

	}

}
