class TakeValues
{
	int a , b;
	
	void setvalue(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
}

class Addition extends TakeValues
{
	void getAdditon()
	{
		System.out.println("Addition of a and b is " + (a + b));
	}
	
}

class Multiply extends TakeValues
{
	void getMultiply()
	{
		System.out.println("Multiplication of a and b is " + (a * b));
	}
}









public class Inheritance
{
	public static void main(String ss[])
	{
		Addition add = new Addition();
		add.setvalue(10,20);
		add.getAdditon();
		
		Multiply mul = new Multiply();
		mul.setvalue(20,30);
		mul.getMultiply();	
	}



}