package polymorphism;

public class SumTest {

	public static void main(String[] args) {
		
		Sum obj1=new Sum();
		//obj1.add(10, 20);
		//obj1.addDouble(10.22, 20.33);
		//obj1.addLong(2200033000L, 4400055000L);
		//obj1.addThreeInt(10, 20,30);
		obj1.add(10, 20);
		obj1.add(10.22, 20.33);
		obj1.add(2200033000L, 4400055000L);
		obj1.add(10, 20,30);
		
	}

}
