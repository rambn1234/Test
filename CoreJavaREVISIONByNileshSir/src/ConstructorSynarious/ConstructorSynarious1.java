package ConstructorSynarious;

public class ConstructorSynarious1 {
    private int var;
   
    public ConstructorSynarious1()
    {
           this.var = 10;
    }
  
    public ConstructorSynarious1(int num)
    {
           this.var = num;
    }
    public int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
    	ConstructorSynarious1 obj = new ConstructorSynarious1();
    	ConstructorSynarious1 obj2 = new ConstructorSynarious1(100);
            System.out.println("var is: "+obj.getValue());
            System.out.println("var is: "+obj2.getValue());
    }
}


