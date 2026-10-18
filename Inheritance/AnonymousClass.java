abstract class A
{
	abstract void show();
}

public class AnonymousClass
{
	public static void main(String ss[])
	{
		A obj = new A()
		{
			void show()
			{
				System.out.println("show called");
			}
		};
		
		obj.show();
	}
	



}