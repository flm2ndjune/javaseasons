package abstraction;

public class MyClass implements MyInter{

	@Override
	public void display(int a) {
		
		System.out.println("a is "+a);
		
	}

	@Override
	public void greet() {
		
		System.out.println("Hi ..Good Evening ...");
		
	}

}
