package inheritance;

public class Leave extends Marks {
	
	int sl,cl;
	
	public void setLeaves(int sl,int cl)
	{
		this.sl=sl;
		this.cl=cl;
	}
	
	public void getLeaves()
	{
		System.out.println("No of leaves taken : "+(sl+cl));
	}

	@Override
	public void getDetails()
	{
		System.out.println("************************");
		System.out.println("rolll no : "+rollNo+" Student name: "+sNa);
		System.out.println("*************************");
	}
	
}
