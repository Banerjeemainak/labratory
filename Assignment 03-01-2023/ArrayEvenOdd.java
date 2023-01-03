package basic;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int even=0,odd=0;
		System.out.print("Enter the number of elements you want to add: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements into array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even+=1;
			}
			else
			{
				odd+=1;
			}
		}
		System.out.println("Number of even numbers: "+even);
		System.out.println("Number of odd numbers: "+odd);
}
}
