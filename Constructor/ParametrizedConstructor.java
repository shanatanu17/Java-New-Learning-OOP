class Test
{
	int id;
	String name;
	
	
	Test(int id , String name)
	{
		this.id = id;
		this.name = name;
	}

}


public class ParametrizedConstructor
{
	public static void main(String ss[])
	{
		Test obj = new Test(10, "nishant");
		
		System.out.println("Id " + obj.id + " Name " + obj.name );
		
	}
}