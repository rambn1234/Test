package CallByValue;

public class CallByValue {

	
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  
	     
//	 void m1(CallByValue ob)
//	 {
//		 ob.data+=10000;
//		  System.out.println("yyyyyyyyy"+ob.data);
//	 }
	 
	 
	 public static void main(String args[]){  
		 CallByValue op=new CallByValue();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
//
//	  op.m1(op);
//	  
//	  System.out.println("yyyyyyyyy"+op.data);
}
}
