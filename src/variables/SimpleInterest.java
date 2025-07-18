package variables;

public class SimpleInterest {
	
	int z;
	static int y;
	public static void main(String[] args) {
		
		int principalAmount;  //declaration
		principalAmount=10000;  //assignment
		
		int time=12; //Initialization
		int rateOfInterest=12; //Initialization
		
		//Initialization
		double simpleInterest=(principalAmount*time*rateOfInterest)/100;
		
		System.out.println(simpleInterest);
		
		SimpleInterest obj1=new SimpleInterest();
		System.out.println(obj1.z);
		
		System.out.println(y);  // not preferred
		System.out.println(obj1.y); // not preferred
		System.out.println(SimpleInterest.y);  //preferred 
		
		
		
	}
	
}
