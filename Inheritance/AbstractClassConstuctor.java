abstract class Circle{
	float rad,pi;
	
	Circle()
	{
		pi = 3.14f;
	}
	
	void setRadius(int rad)
	{
		this.rad = rad;
	}
	
	
	abstract float getCircleResult();
	
	
}


class CircleArea extends Circle {
	
	float getCircleResult()
	{
		return rad * rad * pi; 
	}
}

class CircleCircumferance extends Circle{
	
	float getCircleResult()
	{
		return 2 * pi * rad;
	}
}




public class AbstractClassConstuctor
{
	public static void main(String ss[])
	{
		
		Circle c = null;
		
		//1.
		
		c = new CircleArea();
		
		c.setRadius(10);
		
		float area = c.getCircleResult();
		System.out.println("Area of circle" + area);
		
		
		//2 . 
		c = new CircleCircumferance();
		
		c.setRadius(20);
		
		float circumferance = c.getCircleResult();
		System.out.println("Circuferance of circle" + circumferance);
		
		
	}
	
}