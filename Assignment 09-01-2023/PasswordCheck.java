package string;

import java.util.Scanner;

public class PasswordCheck {
	public static void input()
	{
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password: ");
		String str=sc.nextLine();
		if(str.equals(null))
		{
			input();
		}
		else
		{
			a=checkpassword(str);
		}
		if(a==0)
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println("valid password");
		}
		
	}
	public static int checkpassword(String str)
	{
		int b=0,c=1;
		if(str.length()<4)
		{
			return b;
		}
		else if(str.charAt(0)>='0' && str.charAt(0)<='9')
		{
			return b;
		}
		else if(str.charAt(0)>='A' && str.charAt(0)<='Z')
		{
			return b;
		}
		else if(str.charAt(0)>='0'&& str.charAt(0)<=9)
		{
			return b;
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' '||str.charAt(i)=='/')
			{
				return b;
			}
			
		}
		return c;
	}

	public static void main(String[] args) {
		input();
		
	}

}
