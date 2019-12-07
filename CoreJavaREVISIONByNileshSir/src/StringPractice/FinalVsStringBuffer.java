package StringPractice;

public class FinalVsStringBuffer {

	
	public static void main(String[] args) {
	
		final StringBuffer sb=new StringBuffer("durga");
		
		sb.append("Software");          // change in object 
		System.out.println(sb);
		
		
		//sb=new StringBuffer("Sulusion"); // CE No reAssignment Of Final StringBuffer Object .
		
		
		
		
		
	}
	
	
	
	
	
	
}
