package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		List<String> listOfStudentNames=new ArrayList<String>();
		
		listOfStudentNames.add("Ramesh");
		listOfStudentNames.add("Santosh");
		listOfStudentNames.add("Sravani");
		listOfStudentNames.add("Tulasi");
		//listOfStudentNames.add(10);
		listOfStudentNames.add("Akhil");
		
		System.out.println(listOfStudentNames);
		
		for(int i=0;i<listOfStudentNames.size();i++)
		{
			System.out.println(listOfStudentNames.get(i));
		}
		
		

	}

}
