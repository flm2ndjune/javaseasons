package encapsulation;

public class ClockTest {

	public static void main(String[] args) {
	
		Clock c1=new Clock();
		c1.setClock(9, 2, 10);
		c1.getClock();
		c1.setClock(10, 2, 55);
		c1.getClock();
		
	}

}
