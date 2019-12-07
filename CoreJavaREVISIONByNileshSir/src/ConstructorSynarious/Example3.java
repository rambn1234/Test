package ConstructorSynarious;

public class Example3 
{
      private int var;
      
      public Example3()        // when Parameterize constructor use then default constructor is not call. 
      {
             var=200;
      }
      
      public Example3(int num)
      {
             var=num;
      }
      public int getValue()
      {
              return var;
      }
      public static void main(String args[])
      {
              Example3 myobj = new Example3(100);
              System.out.println("value of var is: "+myobj.getValue());
      }
}