package basic;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int no,num,r,sum=0;
		System.out.print("Enter the number: ");
		no=sc.nextInt();
		num=no;
		while(no!=0)
		{
			r=no%10;
			sum=sum+(int)Math.pow(r,3);
			no=no/10;
		}
		if(sum==num)
		{
			System.out.println("The number "+num+" is a amstrong number..");
		}
		else
		{
			System.out.println("The number "+num+" is not a amstrong number..");
		}
	}

}
