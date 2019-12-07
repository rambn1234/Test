package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;   // Simple Customize Comparator Example

import java.util.Comparator;
import java.util.TreeSet;

class MyComparatror implements Comparator<Integer>
{
	public int compare(Integer ob1, Integer ob2) {
	
		if(ob1<ob2)
		{return +1;
		}
		else if(ob1>ob2)
		{
			return -1;
		}
		else
	   return 0;
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparatror());
		
		t.add(10);
		t.add(14);
		t.add(1);
		t.add(25);
		t.add(50);
		
		System.out.println(t);
	}
}
