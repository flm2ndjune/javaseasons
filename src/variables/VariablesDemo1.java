package variables;

public class VariablesDemo1 {

	int y;
	static int z=300;
	
	
	public static void main(String[] args) {
		
		//x is local variable
		int x=1000;
		
		System.out.println(x); 
		
		System.out.println(20+x);

		
		//instance or object creation
		VariablesDemo1 obj1=new VariablesDemo1();
		System.out.println(obj1.y);
		
		System.out.println(VariablesDemo1.z);
		//System.out.println(z);
		
	}
	

}
	
