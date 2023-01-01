package opps;

import java.util.Scanner;

class Employee29
{
	String emp_id;
	String emp_name,desig;
	double basic_salary;
	int year;
	
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the employee id: ");
		emp_id=sc.next();
		System.out.print("Enter the employee name: ");
		emp_name=sc.next();
		System.out.print("Enter the employee basic salary: ");
		basic_salary=sc.nextDouble();
		System.out.print("Enter the year of joining: ");
		year=sc.nextInt();
		System.out.print("Enter the designation of the employee: ");
		desig=sc.next();
	}

	public void getAppraisal()
	{
		if((2022-year)>=1)
		{
			double appraisal=basic_salary*(0.1);
			System.out.println("Your appraisal is: "+appraisal);
		}
		else
		{
			System.out.println("No appraisal will be given..");
		}
	}
	
	public void calculateTA()
	{
		String str="";
		str=desig.toLowerCase();
		if(str.equals("manager"))
		{
			double ta=3000;
			System.out.println(ta+" TA will be given..");
		}
		else
		{
			double ta=1000;
			System.out.println(ta+" ta will be given..");
		}
	}
	void display()
	{
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee name: "+emp_name.toUpperCase());
		System.out.println("Employee designation: "+desig.toUpperCase());
		System.out.println("Employee basic salary: "+basic_salary);
		System.out.println("Employee's joining year: "+year);
	}
}

public class Employee29Dec {

	public static void main(String[] args) {
		Employee29 emp=new Employee29();
		emp.setData();
		emp.display();
		emp.getAppraisal();
		emp.calculateTA();
	}

}
