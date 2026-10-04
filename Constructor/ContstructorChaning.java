class Test
{
	Test()
	{
		this(100,200);
		System.out.println("I am a default constructor");
		
	}
	
	Test(int a , int b)
	{
		this(10,20,30);
		System.out.println("Mul a and b " +  ( a * b));
		
	}
	
	Test(int a , int b , int c)
	{
		System.out.println("Mul a and b and c " +  ( a * b * c));
	}

}

public class ContstructorChaning
{
	public static void main(String ss[])
	{
	   Test obj = new Test();	
	}
	
}