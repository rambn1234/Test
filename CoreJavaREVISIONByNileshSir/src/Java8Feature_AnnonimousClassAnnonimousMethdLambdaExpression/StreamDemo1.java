package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class StreamDemo1 {

	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(30);
		l.add(25);
		System.out.println(l);
		System.out.println("Print only even Number................");

ArrayList<Integer> al=(ArrayList<Integer>) l.stream().filter(I->I%2==0).collect(Collectors.toList());	
		
		System.out.println(al);
	}
	
	
	
	
	
	
	
	
}
