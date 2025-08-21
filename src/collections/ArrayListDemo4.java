package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
	
		List al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add("FLM");
		
		al.add(10.22);
		
		al.add(true);
		
		al.add('a');
		
		System.out.println(al);
		
		//normal for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//for each loop
		for(Object temp:al)
		{
			System.out.println(temp);
		}
		
		//iterator
		Iterator  it=al.iterator();
				
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
