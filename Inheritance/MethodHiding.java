class A{
	
	static void show()
	{
		System.out.println("class A");
	}
}


class B extends A{
	
	static void show(){
		System.out.println("Class B");
	}
}


public class MethodHiding
{
	public static void main(String ss[])
	{
		A obj = new B();
		
		obj.show();
		
	}

}