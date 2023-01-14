//program to count the number of tyres of each dealer
package opps;

import java.util.Scanner;

public class TyreDealer {
	
	public static void calculate()
	{
		int cust;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of dealers: ");
		cust=sc.nextInt();
		int arr[][]=new int[cust][2];
		System.out.println();
		for(int i=0;i<cust;i++)
		{
			System.out.print("Enter the number of cars and bikes respectively of dealer "+(i+1)+": ");
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<cust;i++)
		{
			int tyre=((arr[i][0])*4)+((arr[i][1])*2);
			System.out.println("Total tyres need for dealer "+(i+1)+" is: "+tyre);
			tyre=0;
		}
	}

	public static void main(String[] args) {
		calculate();
	}

}
