package basic;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String args[]) {
		Scanner	sc=new Scanner(System.in);
		int n,i,f=1,no,sum=0,r;
		System.out.print("Enter the number: ");
		no=sc.nextInt();
		n=no;
		while(no>0)
		{
			r=no%10;
			for(i=1;i<=r;i++)
			{
				f=f*i;
			}
			sum=sum+f;
			no=no/10;
			f=1;
		}
		if(sum==n)
		{
			System.out.println("The number "+n+" is a strong number..");
		}
		else
		{
			System.out.println("The number "+n+" is not a strong number..");
		}
	}
}
