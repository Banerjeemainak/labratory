package opps;

import java.util.Scanner;

public class RatHouse {

	public static void main(String[] args) {
		int rat,unit,house,sum=0,total_unit;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rats: ");
		rat=sc.nextInt();
		System.out.print("Enter the number of unit of food a rat can eat: ");
		unit=sc.nextInt();
		System.out.print("Enter the number of houses: ");
		house=sc.nextInt();
		int arr[]=new int[house];
		total_unit=rat*unit;
		System.out.println("Enter the number of food unit in every house..... ");
		System.out.println();
		for(int i=0;i<house;i++)
		{
			System.out.print("Enter the unit in house no "+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<house;i++)
		{
			sum=sum+arr[i];
			if(sum>=total_unit)
			{
				System.out.println("House needed: "+(i+1));
				break;
			}
			else if(i==house)
			{
				if(sum<total_unit)
				{
					System.out.println("No sufficient food..");
				}
			}
		}
		
		
		
	}

}
