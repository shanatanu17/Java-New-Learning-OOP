class Loan
{   int year;
    void setTenuar()
	{ year=10;
	}
}
class HomeLoan extends Loan 
{
  void  setTenuar(){
     year=30;
  }
  void showHomeLoan()
  { System.out.println("Home Loan Period "+year);
  }
}
class CarLoan extends Loan
{  void setTenuar()
   { year=7;
   }
   void showCarLoan(){
	   System.out.println("Loan period "+year);
   }
}
public class OAPP
{  public static void main(String x[])
   {
        HomeLoan hl = new HomeLoan();
		hl.setTenuar();
		hl.showHomeLoan();
		CarLoan cl = new CarLoan();
		cl.setTenuar();
		cl.showCarLoan();
   }
}
