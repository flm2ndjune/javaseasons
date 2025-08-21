package assignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		List al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add("FLM");
		
		al.add(10.22);
		
		al.add(true);
		
		al.add('a');
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		al.add(1,'b');
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		
		
	}

}
