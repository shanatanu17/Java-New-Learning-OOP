class Bank
{
 public static void RateOfInterest()
 {
   System.out.println("General ROI is 5%");
 }
}


class ICICI extends Bank
{
  
  @Override
  public void RateOfInterest()
 {
   System.out.println( "ROI for ICICI is" + "8%");
 }

}



class Maha extends Bank
{
  
  @Override
  public void RateOfInterest()
 {
   System.out.println("ROI for Maha is" + "7%");
 }

}






public class FunctionOverriding
{
 public static void main(String ss[])
{
  
  Bank obj = new Bank();
  obj.RateOfInterest();

  ICICI obj1 = new ICICI();
  obj1.RateOfInterest();

  Maha obj2 = new Maha();
  obj2.RateOfInterest();
  
}

}