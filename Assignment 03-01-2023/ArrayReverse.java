package basic;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
		System.out.println("Reverse: ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
