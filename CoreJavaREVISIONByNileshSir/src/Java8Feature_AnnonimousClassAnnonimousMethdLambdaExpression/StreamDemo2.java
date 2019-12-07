package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	
	
	public static void main(String[] args) {
		System.out.println(" Orignal Number value toi Double Value in Array List ");
		System.out.println(" By Stream Concept");
		
		
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println("Orignal Vaslue");
		System.out.println(l);
		
		List<Integer> l1=l.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println("By Stream Make Double value="+l1);
		

		
	}
}

















