package objectandclass;

public class Person {
	
	public String name;
	
	public int age;
	
	public long ph;
	
	public void greet()
	{
		System.out.println("Hi "+name+"..Good Evening ..How are you today ??");
	}
	
	public static Person getPerson()
	{
		Person obj=new Person();
		return obj;
		
	}

}
