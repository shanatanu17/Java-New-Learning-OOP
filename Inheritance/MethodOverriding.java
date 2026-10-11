
class A{
	
	void run()
	{
		System.out.println("class A run");
	}
}

class B extends A{
	
	void run()
	{
		System.out.println("class B run");
	}
}







public class MethodOverriding
{
 public static void main(String ss[])
 {
   B obj = new B();
   
   obj.run();
   
   
 }
}