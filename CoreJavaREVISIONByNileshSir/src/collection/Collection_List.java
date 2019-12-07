package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_List {

	
		public static void main(String[] args) {
			
			
					
			
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(25);
		Collections.synchronizedList(al);
		System.out.println(al);
	
		
	}
}
