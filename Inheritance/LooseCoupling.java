class Value{
	
	int a,b;
	void setValue(int x, int y)
	{
		a = x;
		b = y;
	}
	
	int getResult()
	{
		return 0;
	}
}


class Addition extends Value{
	
	int getResult()
	{
		return a + b;
	}
}

class Multiply extends Value{
	
	int getResult()
	{
		return a * b;
	}
}


class Calculator{
	
	void performOperation(Value val)
	{
		int result = val.getResult();
		System.out.println("Result is " + result);
	}
	
}

public class LooseCoupling
{
	public static void main(String ss[])
	{
		Value vobj = null;
		
		
		Calculator cobj = new Calculator();
		
		//for Addition class
		
		
		vobj = new Addition();
		
		vobj.setValue(10,20);
		cobj.performOperation(vobj);
		
		
		//for Multiply class
		vobj = new Multiply();
		vobj.setValue(20,20);
		cobj.performOperation(vobj);
			
	}
}