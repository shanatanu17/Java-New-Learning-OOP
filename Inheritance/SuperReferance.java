class A{
	
	void display()
	{
		System.out.println("class A display");
	}
}

class B extends A{
	
	void display()
	{
		super.display();
		System.out.println("class B display");
	}
}



public class SuperReferance{
	public static void main(String ss[])
	{
	   B obj = new B();
	   obj.display();
	}
}