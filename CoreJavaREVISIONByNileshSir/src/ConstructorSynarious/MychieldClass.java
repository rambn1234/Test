package ConstructorSynarious;

//Super()
//Whenever a child class constructor gets invoked it implicitly invokes the constructor of parent class. You can also say that the compiler inserts a super(); statement at the beginning of child class constructor.

class MyParentClass {
   MyParentClass(){
	System.out.println("MyParentClass Constructor");
   }
}
class MychieldClass extends MyParentClass{
	MychieldClass() {
	System.out.println("MyChildClass Constructor");
   }
   public static void main(String args[]) {
	new MychieldClass();
   }
}


/*
 * O/P
 *  MyParentClass Constructor
 *  MyChildClass Constructor
 */