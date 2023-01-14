//program to calculate the price of wall painting
//input: number of walls,surface of interior and interior

package opps;

import java.util.Scanner;

public class WallPainting {
	public static void input()
	{
		int interior;
		int exterior;
		float total_inter=0;
		float total_exter=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of interior walls: ");
		interior=sc.nextInt();
		System.out.print("Enter the number of exterior walls: ");
		exterior=sc.nextInt();
		float inter[]=new float[interior];
		float exter[]=new float[exterior];
		System.out.println();
		for(int i=0;i<interior;i++)
		{
			System.out.print("Enter the unit of no "+(i+1)+" interior wall in square feet: ");
			inter[i]=sc.nextFloat();
			total_inter=total_inter+inter[i];
		}
		System.out.println();
		for(int i=0;i<exterior;i++)
		{
			System.out.print("Enter the unit of no "+(i+1)+" exterior wall in square feet: ");
			exter[i]=sc.nextFloat();
			total_exter=total_exter+exter[i];
		}
		calculate(total_inter,total_exter);
		
	}
	
	public static void calculate(float total_inter,float total_exter)
	{
		System.out.println();
		System.out.println("Total unit of interior wall is: "+total_inter+" sqft");
		System.out.println("Total unit of exterior wall is: "+total_exter+" sqft");
		System.out.println();
		System.out.println("Total cost of interior walls: "+(total_inter*(float)18)+" INR");
		System.out.println("Total cost of exterior walls: "+(total_exter*(float)12)+" INR");
		float cost=(total_inter*(float)18)+(total_exter*(float)12);
		System.out.println("Total estimate cost: "+cost+" INR");
	}

	public static void main(String[] args) {
		input();
	}

}
