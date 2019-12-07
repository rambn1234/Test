package collection;

import java.util.ArrayList;

public class List_Interface_Methods {
public static void main(String[] args) {
	
	
ArrayList al=new ArrayList();

al.add(12);
al.add(25);
al.add("A");
al.add("B");

System.out.println(al.get(1)); // get object at index location 
System.out.println(al);

//al.addAll(3,al);  add collection object at index location it must be less then size of collection 
//System.out.println(al); 
al.addAll(4,al);
System.out.println(al);

	al.set(4, 10);// add object at index location of collection
	System.out.println(al);

	System.out.println(al.lastIndexOf(10));
	System.out.println(al.indexOf("A"));
	
}
}
