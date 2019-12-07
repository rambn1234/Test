package StringPractice;

public class ImutableCustomizeClass {

	
	
	
	public static void main(String[] args) {
		
		
		
		int i=10;
		int j=100;
		System.out.println(i==j );// false 
		System.out.println();
		
		 String s1="Ram";
		 String s2="Nagargoje";
		 String s3="Ram";
		 System.out.println(s1==s2 );
		  
		 System.out.println(s1==s1);
		 System.out.println(s1==s3);
		 String s4=new String("Ram");
		 System.out.println(s1==s4); //Referance Check 
		 System.out.println(s1.equals(s4));
		 
	} 
	
	
	
	
}
