public class FunctionOverloading
{

 public static void main(String args[])
 {
  System.out.println(add(10,20));
  System.out.println(add(10,20,30));
  System.out.println(add("Shantanu" , "Shinde"));
 }


 public static int add(int a,int b)
 {
  return a+b;
 }

 public static int add(int a,int b,int c)
 {
   return a+b+c;
 }

 public static String add(String a,String b)
 {
   return a+b;
 }


}