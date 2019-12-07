package TypeCasting;

class X
{
	
	void show()
	{
		System.out.println(" Parent Show method call..........");
	}
	
	void work() {
		System.out.println(" Work Method Call..................");
	}
	
}


class Y extends X
{
	
	
	void show()
	{
		System.out.println(" Show override method............");
	}
	
	
	void run1() {
		System.out.println(" Run method call..............");
	}

}


public class FirstProgram {

	public static void main(String[] args) {
		X obj=new Y();  // Parent class reference assign child class object.  
		
		obj.show();
		obj.work();
		//obj.run1();  //X x  compile time checking  run1 method not sapadne .
		
		
		
//		Y objy=new X();  // Compile time Exception child class reference can not assign parent class object . because run time run1(); method will not be fiend out .[  parent class property inherit into child class but not child class property inherit to parent class , so we cant call method of child class.] 
		
		//objy.show();
		//objy.work();
	//	objy.run1();// runtime this method will not be get .
		
		
		// method calling run time.
	}
	
}
