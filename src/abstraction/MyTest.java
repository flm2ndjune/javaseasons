package abstraction;

public class MyTest {

	public static void main(String[] args) {
		
		//Cannot instantiate the type MyInter
		//new MyInter();
		
		//MyClass obj=new MyClass();
		MyInter obj=new MyClass();
		obj.display(10);
		obj.greet();
		System.out.println(MyInter.PI);

	}

}
