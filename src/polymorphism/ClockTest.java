package polymorphism;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		
		Clock c1=new Clock();
		//c1.m1();
		c1.setClock(8);
		c1.getClock();
	
				
		//user 2
		c1.setClock(8, 26);
		c1.getClock();
		
		
		//user 3
		c1.setClock(9,2,55);
		c1.getClock();

	}

}
