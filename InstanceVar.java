 class Student
{

 int age;
 String name;


}




public class InstanceVar
{
 public static void main(String ss[])
 {

  Student s1 = new Student();

  Student s2 = new Student();

  s1.age = 22;
  s1.name = "Shantanu";

  s2.age = 31;
  s2.name = "aditya ";

  System.out.println("s1 age" + s1.age );
  System.out.println("s1 name" + s1.name );


  System.out.println("s2 age" + s2.age );
  System.out.println("s2 name" + s2.name );

 }

}