package arrays;

import objectandclass.Person;

public class ArraysDemo4 {

	public static void main(String[] args) {
		
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		Person p4=new Person();
		Person p5=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.ph);
		
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.ph);
		
		System.out.println(p4.name);
		System.out.println(p4.age);
		System.out.println(p4.ph);
		
		System.out.println(p5.name);
		System.out.println(p5.age);
		System.out.println(p5.ph);
		
		System.out.println("******************");
		
		p1.name="John";
		p1.age=30;
		p1.ph=9848098480L;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);

	}

}
