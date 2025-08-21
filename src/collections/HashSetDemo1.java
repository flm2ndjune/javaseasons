package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		//List<String> hs=new ArrayList<String>();
		
		System.out.println("size of hashset "+hs.size());
		
		
		System.out.println( hs.add("Apple"));
		
		
		hs.add("Banana");
		
		
		hs.add("Grape");
		
		
		hs.add("Kiwi");
		
		hs.add("Mango");
		
		System.out.println("size of hashset "+hs.size());
		
		System.out.println(hs);
		
		System.out.println( hs.add("Apple"));
		
		
		hs.add("Banana");
		
		
		hs.add("Grape");
		
		
		hs.add("Kiwi");
		
		hs.add("Mango");
		

		System.out.println("size of hashset "+hs.size());
		
		System.out.println(hs);
		
		
	}

}
