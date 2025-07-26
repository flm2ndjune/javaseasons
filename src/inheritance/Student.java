package inheritance;

public class Student {
	
	int rollNo;
	String sNa;
	
	public void setDetails(int rollNo,String sNa)
	{
		this.rollNo=rollNo;
		this.sNa=sNa;
	}
	
	public void getDetails()
	{
		System.out.println("Roll No is "+rollNo);
		System.out.println("Student Name is "+sNa);
	}

}
