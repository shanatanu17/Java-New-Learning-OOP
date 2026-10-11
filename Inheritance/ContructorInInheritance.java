class A
{
 A(int a)
 {
	 System.out.println(a);
	 System.out.println("Const of A");
 }

}


class B extends A
{
 B()
 { 
   super(10);
   System.out.println("Const of B");
 }
}



public class ContructorInInheritance
{
  public static void main(String ss[])
  {
    
	B obj = new B();
  
  }
}