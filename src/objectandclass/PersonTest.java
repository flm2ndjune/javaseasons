package objectandclass;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		p1.greet();
		
		p1.name="sivamani";
		p1.age=33;
		p1.ph=9848022338L;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		p1.greet();
		
		
		Person p2=new Person();
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.ph);
		p2.greet();
		
		p2.name="DJ Tillu";
		p2.age=30;
		p2.ph=9609333222L;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.ph);
		p2.greet();
		
		

	}

}
