package opps;
class Student
{
	int id;
	String name,address;
	long phone;
	
	/*public void setData(int i,String n,String add,long ph)
	{
		id=i;
		name=n;
		address=add;
		phone=ph;
	}*/
	
	public void setData(int id,String name,String address,long phone)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	
	public void getData()
	{
		System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
		System.out.println("ADDRESS: "+address);
		System.out.println("PHONE NO: "+phone);
	}
}
public class ClassDemo {
	
	public static void main(String[] args)
	{
		//create object
		Student student=new Student();
		//using instance of class(not safe)
		/*student.id=101;
		student.name="Mainak";
		student.address="Kolkata";
		student.phone=1234567890;
		System.out.println(student.name);*/
		student.setData(101, "mainak", "Kolkata", 6427547689l);
		student.getData();
	}

}
