class A{
	
	void display()
	{
		System.out.println("Disp in class A");
	}
	
}



class B extends A{
	
	public void display()
	{
		System.out.println("Disp in class B");
	}
	
	/*
	
	protected void display()
	{
		System.out.println("Disp in class B");
	}
	
	*/
	
}


public class OverrideDefaultMethodAsPubilcAndProtectedInChild
{
	public static void main(String ss[])
	{
		B obj = new B();
		obj.display();
	}



}