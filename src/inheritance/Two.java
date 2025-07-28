package inheritance;

public class Two extends One{
	
	int a;
	
	void putA(int a)
	{
		this.a=a;
	}
	
	void getA()
	{
		System.out.println(" a is "+this.a);
		System.out.println(" a is "+super.a);
	}
	
}
