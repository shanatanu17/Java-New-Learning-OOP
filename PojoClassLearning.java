import java.util.*;

class Employee
{
 // private variables 
 private int empid;
 private String name;
 private String address;
 private int salary;
 
 
 //getters and setters
 public void setEmpId(int id)
 {
	 empid = id;
 }
 
 public int getEmpId()
 {
	 return empid;
 }
 
 public void setName(String n)
 {
	 name = n;
 }
 
 
 public String getName()
 {
	 return name;
 }
 
 
 public void setAddress(String add)
 {
	 address = add;
 }
 
 public String getAddress()
 {
	 return address;
 }
 
 public void setSalary(int sal)
 {
	 salary = sal;
 }
 
 public int getSalary()
 {
	 return salary;
 }
 
}



class Company {
	
	
	//create a private var of the Employee class 
	private Employee employee;
	
	
	//sets the emp as object
	public void addNewEmployee(Employee emp)
	{
		employee = emp;
	}
	
	
	//print the current employee
	public void getEmployeeDetails()
	{
		System.out.println(employee.getEmpId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
		System.out.println(employee.getSalary());
		System.out.println();
	}
}



public class PojoClassLearning
{
 public static void main(String ss[])
 {
	 Company c = new Company();
	 
	 Employee e1 = new Employee();
	 
	 e1.setEmpId(11);
	 e1.setName("Shantanu");
	 e1.setAddress("Pune");
	 e1.setSalary(100);
	 
	 c.addNewEmployee(e1);
	 c.getEmployeeDetails();
	 
	 /////////////////////////////////////////////////////////
	 
	 Employee e2 = new Employee();
	 
	 e2.setEmpId(12);
	 e2.setName("kunal");
	 e2.setSalary(20000);
	 
	 c.addNewEmployee(e2);
	 c.getEmployeeDetails();
	 
	 
	 
	 
	 
 }


}