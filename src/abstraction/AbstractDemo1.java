package abstraction;

public class AbstractDemo1 {

	public static void main(String[] args) {
		
		//Numbers obj=new Numbers();
		
		Numbers obj=new Sum();
		obj.compute(10, 20);
		obj.greet();
	}

}
