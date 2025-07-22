package encapsulation;

public class BankApp {

	public static void main(String[] args) {
		
		Bank c1=new Bank();
		
		//System.out.println(c1.balance);
		
		System.out.println(c1.getBalance(9865));
		c1.setBalance(2000);
		System.out.println(c1.getBalance(9865));

	}

}
