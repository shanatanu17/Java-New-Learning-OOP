class A
{
  A(int x)
  {
	System.out.println("x in A" + x);
	System.out.println("Const of a called");  
  }
}


class B extends A
{
 B(int x)
 {
	  super(20);
	  System.out.println("x in B" + x);
	  System.out.println("Const of b called");
 }
}


class C extends B
{
  C()
  { 
      super(10);
	  System.out.println("Const of c called");
  }
}


public class CosntInheritance
{
 public static void main(String ss[])
 {
   
   C obj = new C();
 
 }
}