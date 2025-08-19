package arrays;

import objectandclass.Person;

public class ArraysDemo6 {

	public static void main(String[] args) {
		
		Object[][] obj=new Object[2][3];
		
		obj[0][0]=1;
		obj[0][1]="FLM";
		obj[0][2]=true;
		
		obj[1][0]=2;
		obj[1][1]="Selenium";
		obj[1][2]=false;
		
		
		for(int i=0;i<obj.length;i++)
		{
			for(int j=0;j<obj[i].length;j++)
			{
				System.out.print(obj[i][j]+"    ");
			}
			System.out.println();
		}
		
	}

}
