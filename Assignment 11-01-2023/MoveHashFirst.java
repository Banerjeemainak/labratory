package string;

import java.util.Scanner;

public class MoveHashfirst {
	public static String  movefirst(String str1,int len)
	{
		String str3="";
		String str4="";
		String str5="";		
		String str2=str1;
		char ch;
		final char c='#';
		for(int i=0;i<len;i++)
		{
			ch=str2.charAt(i);
			if(ch==c)
			{
				str3=str3+ch;
			}
			else
			{
				str4=str4+ch;
			}
		}
		str5=str3+str4;
		return str5;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1,str;
		int len;
		System.out.print("Enter the string: ");
		str1=sc.nextLine();
		len=str1.length();
		str=movefirst(str1,len);
		System.out.println("New string is: "+str);
	}

}
