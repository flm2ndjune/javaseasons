package inheritance;

public class OverridingDemo1 {

	public static void main(String[] args) {
		
		//case 1  ==> no method overriding happened
		//P obj=new P();
		
		//case 2 ==> method overriding happened
		//C obj=new C();
		
		//case 3  (Invalid : Type mismatch: cannot convert from P to C)
		//C obj=new P();   
		
		//case 4 *** ==> method overriding happened
		P obj=new C();
		
		obj.m1();
		obj.greet("John");
		System.out.println(obj.x);
		

	}

}
