package string;

import java.util.Scanner;

public class Count_Vowel {
	public static void count(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count=count+1;
			}
		}
		System.out.println("Number of vowels: "+count);

	}

	public static void main(String[] args) {
		String str,str1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		str1=sc.nextLine();
		str=str1.toLowerCase();
		count(str);
			}

}
