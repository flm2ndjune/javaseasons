package inheritance;

public class SchoolApp {

	public static void main(String[] args) {
	
		//Student s1=new Student();
		//Marks s1=new Marks();
		Leave s1=new Leave();
		s1.setDetails(1, "John");
		s1.getDetails(); //compiler will have confusing to link getDetails of Leave class & Student class
		s1.setMarks(80,90,100);
		s1.getResults();
		s1.setLeaves(5, 6);
		s1.getLeaves();

	}

}
