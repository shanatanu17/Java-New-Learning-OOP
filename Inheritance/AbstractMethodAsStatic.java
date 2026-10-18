class parent{
	static abstract void show();
}

class child extends parent{
	
	void show()
	{
		System.out.println("");
	}
}

public class AbstractMethodAsStatic
{
	public static void main(String ss[])
	{
		child c = new child();
		c.show();
	}
}