package flowcontrolstatements;

public class IfElseRules {

	public static void main(String[] args) {
		
		int x=10;
		//if(x>0)
		//System.out.println(x);
		int y;
		if(x>0)
		{
			//only declaration in if is not allowed
			//int y=0; 
			y=0;
		}
		else
		{
			//only declaration in if is not allowed
		    //int y=-1;
			y=-1;
		}
System.out.println(y);

		int i=0;
		
		//always the argument or expression should yield a boolean value 
		//if(i)
		//{
		//	System.out.println("i value is "+i);
		//}

	}

}
