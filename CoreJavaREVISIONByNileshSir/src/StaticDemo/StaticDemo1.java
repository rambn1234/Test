/*                         *********** 1] we can not use static mothod in non static variable*************
 * package StaticDemo;
 * 
 * public class StaticDemo1 {
 * 
 * int x=10;
 * 
 * 
 * 
 * 
 * 
 * public static void main(String[] args) { System.out.println("X="+x); }
 * 
 * 
 * }
 */   
 






 // ******************2] Non Static variable use with Object in static method [System.out.println("X="+ob.x)] ***************

/*package StaticDemo;

public class StaticDemo1 {

	  int x=10;             // Non Static Variable 
	
	
	
	
	
	public static void main(String[] args) {
		
		StaticDemo1 ob=new StaticDemo1();
		
		System.out.println("X="+ob.x); // Non Static variable use with Object [System.out.println("X="+ob.x)]
	
	}
	
	
}*/


// **************Static variable Diarect use in Static Method Hear Main Method is Static***************************

package StaticDemo;

public class StaticDemo1 {

	 static int x=10;
	 int numb=200;
	
	
	public static void main(String[] args) {
			
		System.out.println("X="+x);
	// System.out.println(numb);
	}
	
	
}
