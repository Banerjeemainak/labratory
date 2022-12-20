package opps;
class Employee
{
	int id;
	String name,city,country,state,designation;
	final int aadhar;
	long phone,salary;
	
	public Employee(int id,String name,String city,int aadhar)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.aadhar=aadhar;
	}
	public Employee(int id,String name,String city,int aadhar,String country,String state)
	{
		this(id,name,city,aadhar);
		this.country=country;
		this.state=state;
	}
	public Employee(int id,String name,String city,int aadhar,String country,String state,long salary,long phone,String designation)
	{
		this(id,name,city,aadhar,country,state);
		this.salary=salary;
		this.phone=phone;
		this.designation=designation;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", designation=" + designation + ", aadhar=" + aadhar + ", phone=" + phone + ", salary=" + salary
				+ "]";
	}
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
		System.out.println("CITY: "+city);
		System.out.println("AADHAR NO : "+aadhar);
		System.out.println("STATE: "+state);
		System.out.println("COUNTRY: "+country);
		System.out.println("DESIGNATION: "+designation);
	}
}

public class ConstructorOverloading {
	public static void main(String args[])
	{
		Employee employee1=new Employee(1,"Mainak","Kolkata",122456765);
		employee1.display();
		System.out.println();
		
		Employee employee2=new Employee(2,"intekhab","Murshidabad",567432189,"India","West Bengal");
		employee2.display();
		System.out.println();
		
		Employee employee3=new Employee(3,"Ram","Mumbai",345678932,"India","West Bengal",35000,4674545637l,"Developer");
		employee3.display();
		System.out.println();
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
