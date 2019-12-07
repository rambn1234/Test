package collection;

import java.util.ArrayList;
import java.util.Collections;

public class MakeSynchronizeCollectionObject {

	
	public static void main(String[] args) {
		
		
	ArrayList al=new ArrayList();
	System.out.println();
	al.add(10);
	al.add(15);
	al.add(54);
	al.add(22);
	Collections.synchronizedList(al);  // vector is synchronized , How to make Set Map object Synchronized by Using Collections Class SynchronizedList(List Object)
	
	System.out.println(al);
	}                                                                                                                               //  SynchronizedMap(Map Object);
} 
