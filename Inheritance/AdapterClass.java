abstract class A
{
	abstract void show();
	abstract void run();
}

class B extends A{
	
	void show()
	{
		
	}
	
	void run()
	{
		
	}
	
}


class C extends B{
	
	void show(){
		System.out.println("show called");
	}
	
	void run(){
		System.out.println("run called");
	}
}

public class AdapterClass
{
	public static void main(String ss[])
	{
		C obj = new C();
		obj.show();
		
	}



}