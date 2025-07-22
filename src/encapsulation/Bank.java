package encapsulation;

public class Bank {
	
	private  double balance = 10000.0;
	
	//public methods, some validation
	//getters
	public double getBalance(int pin)
	{
		//validation
		if(pin==9865)
		{
		System.out.println("Valid pin entered..");
		return balance;
		}
		else 
		{
			System.out.println("Invalid pin entered..");
			return 0.0;
		}
		
	}
	
	//setters
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}

}
