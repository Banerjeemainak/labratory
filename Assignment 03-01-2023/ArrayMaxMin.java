package basic;

import java.util.*;

public class ArrayMaxMin {

	public static void main(String[] args) {
		int i,n,max,min;
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n=Sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements into array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=Sc.nextInt();
		}
		System.out.println("Array elemets are: ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		max=min=arr[0];
		
		for(i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum value is: "+max);
		System.out.println("Minimum value is: "+min);
	}
}

