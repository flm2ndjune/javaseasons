package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println("size of hashset "+hs.size());
		
		
		hs.add("Apple");
		
		hs.add("Banana");
		
		hs.add("Grape");
		
		hs.add("Kiwi");
		
		hs.add("Mango");
		
		System.out.println("size of hashset "+hs.size());
		
		System.out.println(hs);
		
		//for each loop
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		//iterator 
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
