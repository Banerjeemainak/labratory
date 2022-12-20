package basic;

import java.util.Scanner;

public class FirstLast_Digit {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int no,last,first,n;
		System.out.print("Enter the number: ");
		no=sc.nextInt();
		n=no;
		last=no%10;
		while(no>=10)
		{
			no=no/10;
		}
		first=no;
		System.out.println("First digit is: "+first);
		System.out.println("Last digit is: "+last);
		
	}
	
}
