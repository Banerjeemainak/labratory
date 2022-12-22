package basic;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int no,n,r,num=0;
		System.out.print("Enter the number: ");
		no=sc.nextInt();
		n=no;
		while(no!=0)
		{
			r=no%10;
			num=(num*10)+r;
			no=no/10;
		}
		if(n==num)
		{
			System.out.println("the number "+n+" is a palindrome number..");
		}
		else
		{
			System.out.println("the number "+n+" is not a palindrome number..");
		}
	}

}
