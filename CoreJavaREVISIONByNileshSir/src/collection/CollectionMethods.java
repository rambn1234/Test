package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionMethods {

	
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(22);
		al.add(15);
		al.add("A");
		al.add("B");
		System.out.println(al);
		
		
	for(Object i : al)
	{
		System.out.println(i);
	}
		
ArrayList al2=new ArrayList();
al2.addAll(al);               // add collection  
System.out.println(al2);
 
	al2.remove("A");     // remove Single object 
	System.out.println(al2);
	
	
	al2.removeAll(al2); // remove all object from collection
	System.out.println(al2);
	
	
		al2.addAll(al);
		System.out.println(al2);
		
		ArrayList al3=new ArrayList();
		al3.add("A");
		al3.add("B");
		
		al2.retainAll(al3);
		System.out.println(al2);
		
		
		System.out.println(al2.size()); // size of collection Object 
		
		
		System.out.println(al2.isEmpty());// check object empty or not.
		
		
		System.out.println(al);
		Iterator itr= al.iterator();
		
	    System.out.println(itr);
	    
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(ob);
		}
		
	}
	
	
	
	
}
