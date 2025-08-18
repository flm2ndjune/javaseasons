package flowcontrolstatements;

public class BreakDemo4 {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=1;i<=5;i++)
		{
			
			
			for(int j=1;j<=5;j++)
			{
				if(j==5)
				{
					continue;
				}
				System.out.println(i+"\t"+j);
				count++;
				}
			
		}

		System.out.println("No of time  looping executed "+count);
		System.out.println("End of program..");
	}

}
