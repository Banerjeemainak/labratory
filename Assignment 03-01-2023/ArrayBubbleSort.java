package basic;

import java.util.Scanner;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,temp;
		System.out.println("Enter the number of elements you want to add: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements into array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sortint array elements are: ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
