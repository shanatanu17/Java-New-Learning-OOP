class A{
	
	int a = 10;
}


class B extends A{
	int a = 20;
	
	void display(){
		System.out.println(" Value of a in Class A " + super.a);
		System.out.println(" Value of a in Class B " + a);
	}
}






public class VariableOverloading{
	public static void main(String ss[])
	{
		
		B obj = new B();
		obj.display();
		
	}
}
