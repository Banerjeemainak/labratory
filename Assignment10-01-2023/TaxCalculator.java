package exceptionhandling;

public class TaxCalculator {
	static double empsal,taxamount;
	static String empname,countname;
	public static void countryCheck(String countname,double empsal) throws Exception3
	{
		if(countname.toLowerCase().equals("india"))
			if(empsal>100000) {
				taxamount=empsal*8/100;
				System.out.println("Tax is: "+taxamount);
			}
			else if(empsal>=50000&&empsal<100000) {
				taxamount=empsal*6/100;
				System.out.println("Tax is: "+taxamount);
			}
			else if(empsal>=30000&&empsal<50000) {
				taxamount=empsal*5/100;
				System.out.println("Tax is: "+taxamount);
			}
			else if(empsal>=10000&&empsal<30000) {
				taxamount=empsal*4/100;
				System.out.println("Tax is: "+taxamount);
			}
			else
				throw new Exception3("TaxNotEligibleException.");
		else
			throw new Exception3("CountryNotValidException.");
	}
	public static void employeeName(String empname) throws Exception4
	{
		if(empname=="")
			throw new Exception4("Name should not be null");
		else
			System.out.println("name is: "+empname);
	}

	public static void main(String[] args) {
		try
		{
			try {
				employeeName("");
			} catch (Exception4 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			countryCheck("india",1000);
		}catch(Exception3 e)
		{
			System.out.println(e.getMessage());
		}
	}

}


//Exception 3 class..
package exceptionhandling;

public class Exception3 extends Exception{
	public Exception3(String cname)
	{
		super(cname);
	}
}

//Exception 4 class..
package exceptionhandling;

public class Exception4 extends Exception{
	public Exception4(String ename)
	{
		super(ename);
	}
}
