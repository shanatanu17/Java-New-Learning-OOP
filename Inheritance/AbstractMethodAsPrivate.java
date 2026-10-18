class parent
{
	private abstract void show();
}


class child extends parent {
	void show(){
		
	}
	
}


public class AbstractMethodAsPrivate
{
	public static void main(String ss[])
	{
		child c = new child();
		c.show();
		
	}


}