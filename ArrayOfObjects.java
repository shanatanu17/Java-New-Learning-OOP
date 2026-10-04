import java.util.*;

class Student
{
  // private vars	
  private int id;
  private String name;
  private String add;
  
  //getters and setters
  public void setid(int i)
  {
	  id = i;
  }
  
  public int getid()
  {q
	  return id;
  }
  
  public void setname(String n)
  {
	  name = n;
  }
  
  public String getname()
  {
	  return name;
  }
  
  public void setadd(String a)
  {
	  add = a;
  }
  
  public String getadd()
  {
	  return add;
  }





}



public class ArrayOfObjects
{
  public static void main(String ss[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number of students");
	  
	  int n = sc.nextInt();
	  
	  //here we created only references for the objects , actual object we created below in loop
	  Student s[] = new Student[n];
	  
	  
	  
	  
	  
	  
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("Enter the " + i + " student data");
		  
		  //create the object of student
		  s[i] = new Student();
		  
		  int sid = sc.nextInt();
		  sc.nextLine();
	 	  String sname = sc.nextLine(); 
	      String sadd = sc.nextLine();
		  
		  s[i].setid(sid);
	      s[i].setname(sname);
	      s[i].setadd(sadd);
		  
		 
	  }
	  
	  
	  //prints the student data
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("Display the student data");
	      System.out.println(s[i].getid() + " " + s[i].getname() + " " + s[i].getadd() );
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }


}