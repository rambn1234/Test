package StringBuffer;

public class FinalAnd_ImutabilityConcept {

	
	
	public static void main(String[] args) {
		System.out.println("Final is associated with variable And Imutability Associated with Object ");
		
		StringBuffer sb=new StringBuffer("Ram");
		sb.append("Chandra");
		System.out.println(sb); // RamChandra   StringBuffer Existing Object in Change .
		sb=sb.append("Nagargoje");
		System.out.println(sb);
		  
		
		final StringBuffer sb1=new StringBuffer("Ram");
		sb1.append("Chandra");
		System.out.println(sb1); // RamChandra   StringBuffer Existing Object in Change .
		//sb1=sb1.append("Nagargoje");   //The final local variable sb1 cannot be assigned.
		System.out.println(sb1);
		
		
		
		// Final Is Associated with the Variable Not And Immutability Associated With THe Object 
	}
}
		
		
		
		
		