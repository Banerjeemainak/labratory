package opps;
class Student1
{
	int id;
	String name,address;
	long phone;
	static String institute="Anudip Foundation";//static variable
	
	public Student1(int id,String name,String address,long phone)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
		System.out.println("ADDRESS: "+address);
		System.out.println("PHONE NO: "+phone);
		System.out.println("INSTITUTE: "+institute);
	}
	
	public static void changeInstitute()
	{
		institute="Anudip Foundation For Social welfare";
	}
}

public class ConstructorDemo {
	public static void main(String args[])
	{
		Student1 student1=new Student1(101,"Mainak","Kolkata",5575867875l);
		student1.display();
		System.out.println();
		Student1 student2=new Student1(102,"intekhab","Murshidabad",57675785656l);
		student2.changeInstitute();
		student2.display();
	}

}
