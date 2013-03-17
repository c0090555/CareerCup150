import java.util.*;
  class MyInt 
  {
      private int i;
  
  
      public MyInt(int ii) { i = ii; }
  
  
      public void increment() { i++; }
  
  
      public String toString() 
      {
          return Integer.toString(i);
      }
   }
  
  
  public class TestClone 
  {
      public static void main(String[] args) 
      {
          ArrayList al = new ArrayList(); 
          for(int i = 0; i < 10; i++ )
              al.add(new MyInt(i));
          
          ArrayList al1 = (ArrayList)al.clone();
          System.out.println(al);
          System.out.println("al11" + al1);
          // Increment all al1's elements:
          for(Iterator e = al.iterator(); e.hasNext(); )
                  ((MyInt)e.next()).increment();
          System.out.println(al);
          System.out.println("al1" + al1);
    }
   }



