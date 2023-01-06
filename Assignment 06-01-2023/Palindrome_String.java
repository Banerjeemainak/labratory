package string;

import java.util.Scanner;

public class Palindrome_String {
	public static void palindrome(String str)
	{
		String str1="",rev="";
		int len;
		len=str.length();
		str1=str.toLowerCase();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		if(str1.equals(rev))
		{
			System.out.println(str+" is a palindrome word..");
		}
		else
		{
			System.out.println(str+" is not a palindrome word..");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str,str2,str1="",rev="";
		System.out.print("Enter the word to check: ");
		str2=sc.nextLine();
		palindrome(str2);
	}
}
