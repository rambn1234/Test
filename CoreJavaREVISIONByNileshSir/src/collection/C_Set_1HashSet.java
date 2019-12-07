package collection;

import java.util.HashSet;

public class C_Set_1HashSet {

	
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
		System.out.println(hs); //[A, 50, B, 100, 10, 30]  Duplication is not allowed and insertion Order is not preserved	
		System.out.println( hs.equals(hs));
		HashSet hs1=new HashSet();
		
		hs1.addAll(hs);//true
		
		System.out.println(hs.equals(hs1));  // content check// True
	
		hs.add(200);
		System.out.println(hs.equals(hs1));  // content check// False
		
		HashSet hs2=(HashSet) hs.clone();
		
		
		System.out.println(hs.clone()); //[A, 50, B, 100, 200, 10, 30]
     	System.out.println(hs2);//[A, 50, B, 100, 200, 10, 30]
		
		System.out.println(hs.size());
		System.out.println(hs.contains("A"));//true
		System.out.println(hs.isEmpty());//false
		System.out.println(hs);
		
		System.out.println(hs.remove(30));//true
		System.out.println(hs);//[A, 50, B, 100, 200, 10]
		System.out.println(hs.add(10));// false  //duplicate element try to add then false return  //false
		
hs.clear();
System.out.println(hs);//[]
	}         
	
}
