package basic;

import java.util.Scanner;

public class FactorialNumber {
	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int i,no,f=1;
	        System.out.print("Enter the number: ");
	        no=sc.nextInt();
	        for(i=1;i<=no;i++)
	        {
	            f=f*i;
	        }
	        System.out.println("Factorial is:"+f);
	    }    

}
