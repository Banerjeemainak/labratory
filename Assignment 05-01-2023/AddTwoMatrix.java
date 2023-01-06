package two_D_Array;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c,i,j;
		System.out.print("Enter the number of rows: ");
		r=sc.nextInt();
		System.out.print("Enter the number of columns: ");
		c=sc.nextInt();
		int arr1[][]=new int[r][c];
		int arr2[][]=new int[r][c];
		int sum[][]=new int[r][c];
		System.out.println("Enter elements in 1st matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements in 2nd matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st matix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("2nd matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Sum of two matrices: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
