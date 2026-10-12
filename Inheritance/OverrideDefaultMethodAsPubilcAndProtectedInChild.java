class A{
	/*
	void display()
	{
		System.out.println("Disp in class A");
	}
	*/
	
	/*
	protected void show()
	{
		
	}
	*/
	
	public void show()
	{
		
	}
	
}



class B extends A{
	
	/*
	public void display()
	{
		System.out.println("Disp in class B");
	}
	*/
	
	/*
	
	protected void display()
	{
		System.out.println("Disp in class B");
	}
	
	*/
	
	/*
	 void show()
	{
		
	}
	*/
	
	
	protected void show()
	{
		
	}
	
}


public class OverrideDefaultMethodAsPubilcAndProtectedInChild
{
	public static void main(String ss[])
	{
		B obj = new B();
		obj.show();
	}



}