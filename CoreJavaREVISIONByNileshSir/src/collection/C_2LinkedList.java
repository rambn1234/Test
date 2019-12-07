package collection;

import java.util.LinkedList;

public class C_2LinkedList {

	
	
	public static void main(String[] args) {
		
		
		
		LinkedList ll=new LinkedList();
		ll.add(10);
		System.out.println(ll);//[10]
		
		ll.addFirst(5);
		System.out.println(ll);//[5, 10]
		
		ll.addLast(15);
		System.out.println(ll);//[5, 10, 15]
		
		System.out.println(ll.getFirst()); //5
		System.out.println(ll.getLast()); //15
		
		
		ll.add(20);
		ll.add(100);
		System.out.println(ll);//[5, 10, 15, 20, 100]
		
		
		System.out.println(ll.removeFirst());//5
		System.out.println(ll);//  [10, 15, 20, 100]
		
		
		System.out.println(ll.removeLast()); //100
		
		System.out.println(ll);
	}
}
