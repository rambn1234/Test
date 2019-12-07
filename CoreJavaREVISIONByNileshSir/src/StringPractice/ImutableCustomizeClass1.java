package StringPractice;

public final class ImutableCustomizeClass1 {

	private int i;
	ImutableCustomizeClass1(int i)
	{
		this.i=i;
	}
	
	private ImutableCustomizeClass1 modify(int i)
	{
		
		if(this.i==i)
		{
		return this;
		}
		
		else
		{
			
			return(new ImutableCustomizeClass1(i));
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ImutableCustomizeClass1 obj1=new ImutableCustomizeClass1(10);
	
		ImutableCustomizeClass1	obj2=obj1.modify(100);
		
		ImutableCustomizeClass1 obj3=obj1.modify(10);
		
		
		System.out.println(obj1==obj2); //false 
		
		System.out.println(obj1==obj3); //true
		
		
		
		
		
	}
}
