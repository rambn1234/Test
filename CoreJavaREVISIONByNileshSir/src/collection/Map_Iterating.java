package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Iterating {

	public static void main(String[] args) {
		
		
		HashMap hm=new HashMap();
		hm.put(1, "Ram");
		hm.put(2, "ganesh");
		
		hm.put(3, "Ravi");
		
		hm.put(4, "vitthal");
		
		hm.put(5, "ramesh");
		
		hm.put(6, "Rahul");
		
		hm.put(7, "pritesh");
		
	    System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		
		Set s=hm.entrySet();
		
		System.out.println(s);
		
		
	Iterator itr=s.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry me=(Map.Entry)itr.next();
		
		//System.out.println(me);
		System.out.println(me.getKey());
		System.out.println(me.getValue());
	}
	
		
	}
	
}
