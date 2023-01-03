package basic;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int c=0;
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
			System.out.print("Enter the element to search: ");
			int no=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				if(arr[i]==no)
				{
					System.out.println("Search successful..Element found in index "+i);
					c=1;
				}
			}
			if(c==0)
			{
				System.out.println("Element not found in array..");
			}
		}
	}

