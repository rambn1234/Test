package collection;

import java.util.Vector;

public class C_3Vectore {

	
	public static void main(String[] args) {
		System.out.println("Vectore Program");
		Vector v=new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(50);
		v.addElement(100);
		
		System.out.println(v); //[10, 20, 50, 100]
		
		
		System.out.println(v.capacity());//10
        System.out.println(v.size());//4
		System.out.println(v.get(0));//10 its list Interface method 
		System.out.println(v.elements());//java.util.Vector$1@15db9742
		
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}
}
