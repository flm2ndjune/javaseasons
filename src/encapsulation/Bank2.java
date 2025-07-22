package encapsulation;

public class Bank2 {
	
	private  double balance = 10000.0;
	
	//public methods, some validation
	//getters
	public void getBalance(int pin)
	{
		//validation
		if(pin==9865)
		{
		System.out.println("Balance is "+balance);
		}
		else 
		{
			System.out.println("Invalid pin entered..");
			
		}
		
	}
	
	//setters
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}

}
