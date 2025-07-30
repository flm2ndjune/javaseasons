package inheritance;

public class One {
	
	int a;
	public One()
	{
		System.out.println("This is One's constructor");
	}
	
	public One(int b)
	{
		System.out.println("b is here ");
	}
	void setA(int a)
	{
		this.a=a;
	}
	
	void greet()
	{
		System.out.println("Hi..");
	}
}
