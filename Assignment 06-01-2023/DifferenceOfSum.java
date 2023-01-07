package opps;

import java.util.Scanner;

public class DiiferenceOfSum {
	
	public static void differenceofSum(int n,int m)
	{
		int i,sum1=0,sum2=0;
		String str1="",str2="";
		for(i=1;i<=m;i++)
		{
			if(i%n==0)
			{
				sum1+=i;
				str1=str1+" "+i;
			}
			else
			{
				sum2+=i;
				str2=str2+" "+i;
			}
		}
		System.out.println();
		System.out.println("Numbers divisible by "+n+" are: "+str1);
		System.out.println("Numbers not divisible by "+n+" are: "+str2);
		System.out.println();
		System.out.println("Sum of numbers divisible by "+n+" are: "+sum1);
		System.out.println("Sum of numbers not divisible by "+n+" are: "+sum2);
		diffoftwosum(sum1,sum2);
	}
	public static void diffoftwosum(int sum1,int sum2)
	{
		int dif;
		if(sum1>sum2)
		{
			dif=sum1-sum2;
			System.out.println("Difference is: "+dif);
		}
		else
		{
			dif=sum2-sum1;
			System.out.println("Difference is: "+dif);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.print("Enter the last term: ");
		m=sc.nextInt();
		System.out.print("Enter divisible number: ");
		n=sc.nextInt();
		differenceofSum(n,m);
	}

}
