package basic;

import java.util.Scanner;

public class EvenNumberSum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int f,l,sum=0;
		System.out.print("Enter the first term: ");
		f=sc.nextInt();
		System.out.print("Enter the last term: ");
		l=sc.nextInt();
		System.out.println("Even numbers between "+f+" and "+l+" are..");
		for(int i=f;i<=l;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum of even numbers is: "+sum);
	}

}
