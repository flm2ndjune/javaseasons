package assignments2;

public class Aadhar {
	
	public void getAadhar(String pan)
	{
		random4DigitGenerator();
	}
	
	public void getAadhar(String pan,String dl)
	{
		random4DigitGenerator();
	}
	
	public void getAadhar(String pan,String dl,String pass)
	{
		random4DigitGenerator();
	}

	private void random4DigitGenerator() {
		
		System.out.print((int)(Math.random()*10000)+" ");
		System.out.print((int)(Math.random()*10000)+" ");
		System.out.print((int)(Math.random()*10000)+" ");
		System.out.print((int)(Math.random()*10000)+" ");
		
	}

}
