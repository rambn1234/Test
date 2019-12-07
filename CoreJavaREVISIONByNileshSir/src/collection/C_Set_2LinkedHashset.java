package collection;

import java.util.LinkedHashSet;
import java.util.Spliterator;

public class C_Set_2LinkedHashset {

	
	public static void main(String[] args) {
		
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add(52);
		lhs.add(5);
		lhs.add(50);
		lhs.add(32);
		lhs.add(82);
		System.out.println(lhs); // duplication not allowed And Insertion Order maintain.[100, 52, 5, 50, 32, 82]
		
		lhs.add(82);
		System.out.println(lhs.add(82));//false
		System.out.println(lhs);//[100, 52, 5, 50, 32, 82]
		
		System.out.println(lhs.contains(82));//true
		//System.out.println(lhs.spliterator());//java.util.Spliterators$IteratorSpliterator@15db9742
		
		
		// Getting Spliterator
		Spliterator namesSpliterator = lhs.spliterator();
			
		// Traversing elements
		namesSpliterator.forEachRemaining(System.out::println);	//default void forEachRemaining(Consumer action): Performs the given action for each remaining element, sequentially in the current thread, until all elements have been processed or the action throws an exception.;
		
		lhs.clear();

		System.out.println(lhs);
	}
}
