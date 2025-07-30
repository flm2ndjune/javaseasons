package inheritance;

public class Two extends One{
	
	int a;
	
	void putA(int a)
	{
		this.a=a;
	}
	
	public Two()
	{
		//super();  this will call parent default constructor
		super(30);  //this will call parent overloaded constructor
		//note : super constructor calling should be in the top 
		System.out.println("Twos constructor..");
		
	}
	
	void greet()
	{
		System.out.println("Hello..");
	}
	
	void getA()
	{
	
		
		System.out.println(" a is "+this.a); //20
		System.out.println(" a is "+super.a); //10
		//greet(); //Hello
		super.greet(); //hi
	}
	
}
