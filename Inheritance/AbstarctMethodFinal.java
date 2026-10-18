class Test{
	final abstract void show();
}

class child extends Test{
	
	void show()
	{
		System.out.println("show");
	}
}


public class AbstarctMethodFinal{
	public static void main(String ss[])
	{
		child c = new child();
		c.show();
	}

}