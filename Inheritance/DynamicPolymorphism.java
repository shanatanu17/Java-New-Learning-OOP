class Value{
	
	int a , b;
	void setValue(int x, int y)
	{
		a = x;
		b = y;
	}
	
	int getValue()
	{
		return 0;
	}
}


class Addition extends Value{
	
	int getValue()
	{
		return a+b;
	}
}


class Multiply extends Value{
	
	int getValue()
	{
		return a*b;
	}
	
}



public class DynamicPolymorphism
{
  public static void main(String ss[])
  {
	  //create a referance of parent class and create object of child class
	  
	  Value vobj = null;
	  
	  vobj = new Addition();
	  
	  vobj.setValue(10,20);
	  int addresult = vobj.getValue();
	  System.out.println("Addition of a and b is " + addresult);
	  
	  
	  
	  vobj = new Multiply();
	  
	  vobj.setValue(50,10);
	  int mulresult = vobj.getValue();
	  System.out.println("multiply of a and b is " + mulresult);
	  
	  
	  
	  
  
  }

}