package collection;

import java.util.HashMap;
import java.util.HashSet;

public class Hs {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(10);
		hs.add(30);
		hs.add(100);
		hs.add(50);
		hs.add(100);
		hs.add("A");
		hs.add("B");
		hs.add(30);
		System.out.println(hs); // Same value can not insert if insert then return false.
		
		
		
		HashMap hm=new HashMap();
		
		hm.put(1, 121);
		hm.put(2, 121);
		System.out.println(hm);
		
		hm.put(3, 122);
		hm.put(3, 125);
		System.out.println(hm);
		
		
		
		
		
		
	}
}
