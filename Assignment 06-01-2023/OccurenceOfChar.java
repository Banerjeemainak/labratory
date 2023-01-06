package string;

import java.io.*;
import java.util.Scanner;

public class OccurenceOfChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1,str;
		int count=0;
		System.out.print("Enter the string: ");
		str1=sc.nextLine();
		str=str1.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			count=0;
			char ch=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				char ch1=str.charAt(j);
				if(j<i&&ch==ch1)
				{
					break;
				}
				if(ch==ch1)
				{
					count=count+1;
				}
			}
			if(count!=0)
			{
				System.out.println("Number of "+ch+" : "+count);
			}
		}
	}

}

