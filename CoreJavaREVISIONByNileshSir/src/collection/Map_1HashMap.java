package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_1HashMap {
	
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put(1, "ram");
		m.put(2, "Ganesh");
		m.put(17, "tukaram");
		m.put(3, "ravi");
		m.put(15, "Vittallll");


			m.put(4, "vishal");
		m.put(4, "Vittal");
		System.out.println(m);//{1=ram, 2=Ganesh, 3=ravi, 4=vishal}
		Set s=m.keySet();
		System.out.println(s);//[1, 2, 3, 4]
		System.out.println(m.values());//[ram, Ganesh, ravi, Vittal]
		
		TreeMap tm=new TreeMap(m);
		System.out.println("Sorted map..........."+tm);
		Set es=m.entrySet();
		System.out.println(es);//[1=ram, 2=Ganesh, 3=ravi, 4=Vittal]
		
		
		
		System.out.println(m.size());//4
		System.out.println(m.isEmpty());// false
		Set  s1= m.entrySet();
		System.out.println(s1);//[1=ram, 2=Ganesh, 3=ravi, 4=Vittal]		
		Iterator itr= s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
			if(me.getKey().equals(1))
			{
				me.setValue("rammmmmmmmmmmmmm");
			}	
		}
		
		System.out.println(m);//{1=rammmmmmmmmmmmmm, 2=Ganesh, 3=ravi, 4=Vittal}
	}
}
