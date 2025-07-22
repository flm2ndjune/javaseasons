package objectandclass;

public class PersonDemo {

	public static void main(String[] args) {
		
		//SFM static factory method
		Person obj1=Person.getPerson();
		System.out.println(obj1.name); //null
		System.out.println(obj1.age);//0
		System.out.println(obj1.ph);//0

	}

}
