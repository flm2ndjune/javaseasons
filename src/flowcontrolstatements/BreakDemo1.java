package flowcontrolstatements;

public class BreakDemo1 {

	public static void main(String[] args) {
		
		System.out.println("start..");
		
		for(int i=1;i<=10;i++)
		{
			//System.out.println(i);
			if(i==5)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("End of program..");

	}

}
