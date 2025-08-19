package arrays;

import objectandclass.Person;

public class ArraysDemo5 {

	public static void main(String[] args) {
		
		Person[] p=new Person[5];
		
		
		for(int i=0;i<p.length;i++)
		{
			
			System.out.println(p[i]);
						
		}
		
		System.out.println("**********************");
		
		/*
		 * p[0]=new Person(); p[1]=new Person(); p[2]=new Person(); p[3]=new Person();
		 * p[4]=new Person();
		 */
		
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Person();
		}
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
			System.out.println(p[i].ph);
		}
		
		System.out.println("**********************");
		p[0].name="john";
		p[0].age=30;
		p[0].ph=9848098480L;
		

		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
			System.out.println(p[i].ph);
		}

	}

}
