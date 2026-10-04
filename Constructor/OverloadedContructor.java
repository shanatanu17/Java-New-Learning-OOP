
class Test
{
	int id;
	float fid;
	
	Test(int id)
	{
		this.id= id;
	}
	
	Test(float fid)
	{
		this.fid = fid;
	}
}

public class OverloadedContructor{
	
	public static void main(String ss[])
	{
		Test obj1 = new Test(11);
		
		Test obj2 = new Test(20.03f);
		
		System.out.println(obj1.id);
		
		System.out.println(obj2.fid);
	}

}