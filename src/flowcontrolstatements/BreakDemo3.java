package flowcontrolstatements;

public class BreakDemo3 {

	public static void main(String[] args) {
		
		int count=0;
		
		label1:
		for(int i=1;i<=10;i++)
		{
			
			for(int j=1;j<=10;j++)
			{
				if(i==5)
				{
					
					
					break label1;
					
					
				}
				else
				{
				System.out.println(i+"\t"+j);
				count++;
				}
			}
		}

		System.out.println("No of time  looping executed "+count);
		System.out.println("End of program..");
	}

}
