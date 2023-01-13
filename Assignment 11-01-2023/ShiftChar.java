package string;

import java.util.Scanner;

public class ShiftChar {
	
	
	public static void shift(String str)
	{
		Scanner sc=new Scanner(System.in);
		int key;
		int asc;
		String str2="";
		System.out.print("Enter the key value(1-25) : ");
		key=sc.nextInt();
		if(key<1||key>25)
		{
			System.out.println("Invalid input..");
			System.exit(0);
		}
		else
		{
			
			for(int i=0;i<str.length();i++)
			{
				asc=(int)str.charAt(i);
				asc+=key;
				str2=str2+(char)asc;
			}
		}
		System.out.println("New string is: "+str2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter the string: ");
		str=sc.nextLine();
		shift(str);
	}

}





