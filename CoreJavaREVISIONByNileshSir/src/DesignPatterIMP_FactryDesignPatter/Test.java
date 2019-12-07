package DesignPatterIMP_FactryDesignPatter;

public class Test {

	public static void main(String[] args) {
		
		
		Currency c=FactryDesignPattern.getCurrency("India");
		
	String s=c.currency();
	System.out.println("Currency is= "+s);
		
	Currency c1=FactryDesignPattern.getCurrency("USA");
	
	String s1=c1.currency();
	System.out.println("Currency is= "+s1);
		
	}
}
