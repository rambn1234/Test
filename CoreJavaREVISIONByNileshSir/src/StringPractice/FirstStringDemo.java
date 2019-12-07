package StringPractice;

public class FirstStringDemo {

	public static void main(String[] args) {
		
	String name=new String("ram");
	System.out.println(name);
	
	char ch='a';
	System.out.println(ch);
	
	String s="Ram nagargoje";
	System.out.println(s);
	
	char ch1[]= {'a','b','c','d'};	
	System.out.println(ch1);
	
	String s1=new String(ch1); 
	
	System.out.println(s1);
	
	
	
	
	
	String st=new String("Ram");
	
	String snew=st.concat("nagargoje");
	
	System.out.println(st); //imutable concept
	
	System.out.println(snew);
	
	
		}
}
