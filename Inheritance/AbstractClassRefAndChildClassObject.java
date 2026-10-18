abstract class A
{
	abstract void show();
}

class B extends A{
	
	void show()
	{
		System.out.println("Show in B");
	}
	
}



public class AbstractClassRefAndChildClassObject
{
	public static void main(String ss[])
	{
		A obj = new B();
		obj.show();
	}



}