package StringBuffer;

public class StringBufferMethod {

	public static void main(String[] args) {
		
		
		StringBuffer sb1=new StringBuffer();
		sb1.capacity();
		System.out.println(sb1.capacity());//16
		
		StringBuffer sb2=new StringBuffer("Ram"); // hear pass String 
	    System.out.println(	sb1.capacity());//16 
	    System.out.println(sb2.charAt(2));//m
		
	    StringBuffer sb3=new StringBuffer("RamNagargoje");
		
		sb3.insert(3,"chandra");
		System.out.println(sb3);//RamchandraNagargoje
		System.out.println(sb3.reverse());//ejogragaNardnahcmaR
		
		StringBuffer sb=new StringBuffer();
		sb.append("PI Value is=");
		sb.append(3.14);
		sb.append("It Is Exactly ");
		sb.append(true);
		System.out.println(sb);   //PI Value is=3.14It Is Exactly true    // append method Pass any type Argument its overloaded method .
		
		
		
		
		
		
		
		
		
	}
}
