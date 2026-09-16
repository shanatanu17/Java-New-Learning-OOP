import java.util.*;


class Temp
{
 // Instance var
 int a;
 
 void setVal(int x)
 {
   a = x;
 }
 
 void getVal()
 {
   System.out.println("Val of a is " + a);
 }
 
 }





public class InstanceVariable
{
 public static void main(String ss[])
 {
  Temp obj = new Temp();
  
  obj.setVal(17);
  obj.getVal();
 }
}