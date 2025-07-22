package hacker;

import encapsulation.Bank;

public class HackerApp {

	public static void main(String[] args) {
		
		Bank c1=new Bank();
		
		//System.out.println(c1.balance);
		
		System.out.println(c1.getBalance(1234));

	}

}
