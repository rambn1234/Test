package collection;

import java.util.IdentityHashMap;

public class Map_2IdentityHashMap {

	
	public static void main(String[] args) {
		
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
	  IdentityHashMap ihm=new IdentityHashMap();
	  ihm.put(i1, "Ram");
	  ihm.put(i2, "ganesh");
	System.out.println(ihm); //{10=Ram, 10=ganesh}    > JVM Internally Used == operator to Identify Duplicate key which is main taffer refrance comparion 
	  
	}
	
}
