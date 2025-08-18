package flowcontrolstatements;

public class ContinueDemo1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			//System.out.println(i);
			if(i==5)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("End of program..");


	}

}
