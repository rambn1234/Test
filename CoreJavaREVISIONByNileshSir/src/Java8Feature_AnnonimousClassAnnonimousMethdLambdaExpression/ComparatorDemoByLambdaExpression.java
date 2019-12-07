package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;

import java.util.Collections;   // Comparator By Lambda Expression
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemoByLambdaExpression {

	public static void main(String[] args) {
		
		
		System.out.println("Main Method Demo Lambda Expression ..................");
//		Comparator<Integer> c1=(I1,I2)->{
//		if(I1<I2)
//		{return +1;
//		}
//		else if(I1>I2)
//		{
//			return -1;
//		}
//		else
//	   return 0;
//	};
		
		Comparator<Integer> c=(I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0;  //By Ternary Operator.		
		
		TreeSet<Integer> t = new TreeSet<Integer>(c);
		
		 t.add(10);
		 t.add(54);
		 t.add(56);
		 t.add(23);
		 System.out.println(t);
	}
	                          //Main Method Demo Lambda Expression ..................
	                           //[56, 54, 23, 10]
}
