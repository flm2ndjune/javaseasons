package encapsulation;

public class Numbers {
	
	int x,y;
	
	//setter
	public void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	
	//getter
	public void getXY()
	{
		System.out.println("x is "+ x);
		System.out.println("y is "+ y);
	}

}
