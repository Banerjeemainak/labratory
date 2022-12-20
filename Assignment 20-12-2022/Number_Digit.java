package basic;

import java.util.Scanner;

public class Number_Digit {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int no,n,c=0;
		System.out.print("Enter the number: ");
		no=sc.nextInt();
		n=no;
		while(n>0)
		{
			n=n/10;
			c=c+1;
		}
		System.out.println("Number of digits: "+c);
	}

}
