import java.util.*;

class Test
{
  int a;
  int b;
  
  void setVal(int x,int y)
  {
    a = x;
	b = y;
  }
  
  void getVal()
  {
    System.out.println(a);
	System.out.println(b);
  }



}




public class AnonymousObject
{
 public static void main(String ss[])
 {
   new Test().setVal(10,20);
   
   new Test().getVal();
   
 
 
 
 }

}