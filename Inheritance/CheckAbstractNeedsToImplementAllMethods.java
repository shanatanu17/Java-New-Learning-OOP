abstract class parent{
	
	abstract void show();
	abstract void run();
}

class child extends parent{
	
	void run()
	{
		
	}
}

public class CheckAbstractNeedsToImplementAllMethods
{
	public static void main(String ss[])
	{
		child c = new child();
		c.run();
	}
}