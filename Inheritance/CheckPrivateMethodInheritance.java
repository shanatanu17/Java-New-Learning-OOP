class A{
	
	private void display()
	{
		System.out.println("Display in class A");
	}
}


class B extends A{
	
	void display()
	{
		super.display();  // cannot able to call the display() of class A
		System.out.println("Display in class B");
	}
}



public class CheckPrivateMethodInheritance
{
	public static void main(String ss[])
	{
		B obj = new B();
		obj.display();
	}
	


}