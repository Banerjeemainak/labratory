package string;

import java.util.Scanner;

public class ReduceStringSize {
	
	public static void reduce(String str)
	{
		String str1="";
		String str2="";
		int count=0;
		str1=str.toLowerCase();
		for(int i=0;i<str1.length();i++)
		{
			count=0;
			char ch=str1.charAt(i);
			for(int j=0;j<str1.length();j++)
			{
				char ch1=str1.charAt(j);
				if(j<i&&ch==ch1)
				{
					break;
				}
				else if(ch==ch1)
				{
					count+=1;
				}
			}
			if(count!=0)
			{
				if(count==1)
				{
					str2=str2+ch;
				}
				else if(count>=2)
				{
					str2=str2+ch+count;
				}
			}
		}
		System.out.println("Reduce string is: "+str2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter the string: ");
		str=sc.nextLine();
		reduce(str);
	}

}
