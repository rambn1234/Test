package collection;

import java.util.TreeSet;

public class C_Set_3SortedSet_TreeSet {

	
	
	public static void main(String[] args) {
		
	TreeSet t=new TreeSet();
	t.add(10);
	t.add(45);
	t.add(75);
	t.add(54);
	t.add(30);
	t.add(85);
	t.add(20);
		// Methods of SortedSet Interface bellow 
System.out.println(t);//[10, 20, 30, 45, 54, 75, 85]
System.out.println(t.first());//10
System.out.println(t.last());//85 
System.out.println(t.headSet(85));//[10, 20, 30, 45, 54, 75] // less then given element  given element chod ke.
System.out.println(t.tailSet(20));//[20, 30, 45, 54, 75, 85]// grater then and equalto given element
System.out.println(t.subSet(20,75));//[20, 30, 45, 54] // 



// Method of TreeSet Class Bellow
System.out.println(t);//[10, 20, 30, 45, 54, 75, 85]
System.out.println(t.first());//10
System.out.println(t.last());//85 
System.out.println(t.headSet(85));//[10, 20, 30, 45, 54, 75] // less then given element  given element chod ke.
System.out.println(t.tailSet(20));//[20, 30, 45, 54, 75, 85]// grater then and equalto given element
System.out.println(t.subSet(20,75));//[20, 30, 45, 54] // 

System.out.println(t.size());
System.out.println(t.isEmpty());
System.out.println(t.clone());
t.clear();



	}
}
