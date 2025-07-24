package encapsulation;

public class Clock {
	
	private int hr,min,sec;

	public void setClock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void getClock()
	{
		//System.out.println(hr+":"+min+":"+sec);
		System.out.format("%02d:%d:%d",hr,min,sec);
		System.out.println();
	}
	

}
