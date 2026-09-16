import java.util.*;


class Employee {
	
	private String name;
	private int id;
	private int salary;
	private int age;
	private String address;
	
	
	public void setname(String n)
	{
		name = n;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setid(int i)
	{
		id= i ;
	}
	
	public int getid()
	{
		return id;
	}
	
	public void setSalary(int s)
	{
		salary = s;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAddress(String add)
	{
		address = add;
	}
	
	public String getAddress()
	{
		return address;
	}	
	
}




class Company{
	
	private Employee empl;
	
	void addEmployee(Employee emp)
	{
		empl = emp;
	}
	
	void showEmployeeDetails()
	{
		System.out.println("Emp name" + empl.getname() + " " + "emp id" + empl.getid()  + "Emp salary" + empl.getSalary() + "Emp age" + empl.getAge() + "Emp Address" + empl.getAddress());
	}
	
}






public class POJO
{
	public static void main(String ss[])
	{
		Company c = new Company();
		
		Employee e = new Employee();
		
		e.setname("Adi");
		e.setAge(31);
		e.setAddress("Bhosari");
		
		c.addEmployee(e);
		c.showEmployeeDetails();
	}



}