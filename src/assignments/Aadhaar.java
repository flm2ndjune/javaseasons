package assignments;

public class Aadhaar {
int passport,drivinglicense,voterid;

public void getAadhaar(int passport)
{
this.passport=passport;	
setAadhaar();
setAadhaar();
setAadhaar();
}

public void getAadhaar(int passport,int drivinglicense)
{
	this.passport=passport;
	this.drivinglicense=drivinglicense;
	setAadhaar();
	setAadhaar();
	setAadhaar();
	
}
public void getAadhaar(int passport,int drivinglicense,int voterid)
{
	this.passport=passport;
	this.drivinglicense=drivinglicense;
	this.voterid=voterid;
	setAadhaar();
	setAadhaar();
	setAadhaar();
	
	
}
public void setAadhaar()
{
	System.out.print((int)(Math.random()*10000)+" ");
}
}
