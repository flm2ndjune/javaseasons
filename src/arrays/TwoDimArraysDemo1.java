package arrays;

public class TwoDimArraysDemo1 {

	public static void main(String[] args) {
		
		int[][] a=new int[2][3];
		
		System.out.println("no of rows "+a.length);
		System.out.println("no of elements in a row "+"1 is "+a[0].length);
		System.out.println("no of elements in a row "+"2 is "+a[1].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=100;
		a[1][1]=200;
		a[1][2]=300;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
