package encapsulation;

public class BankApp2 {

	public static void main(String[] args) {
		
		Bank2 c1=new Bank2();
		
		//System.out.println(c1.balance);
		
		c1.getBalance(9865);
		c1.setBalance(2000);
		c1.getBalance(9865);

	}

}
