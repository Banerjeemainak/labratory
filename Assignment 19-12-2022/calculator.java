package basic;

import java.util.Scanner;

public class calculator {

	public static int addition(int a,int b)
	{
		int result=a+b;
		return result;
	}
	public static int substraction(int a,int b)
	{
		int result;
		if(a>b)
		{
			result=a-b;
		}
		else
		{
			result=b-a;
		}
		return result;
	}
	public static int multiplication(int a,int b)
	{
		int result=a*b;
		return result;
	}
	public static float division(float a,float b)
	{
		float result;
		if(a>b)
		{
			result=a/b;
		}
		else
		{
			result=b/a;
		}
		return result;
	}
	public static void main(String[] args)
	{
		int choice,num1,num2,res;
		float num3,num4,res1;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Which operation do you want to perform....");
		System.out.println("1. Addition..");
		System.out.println("2. Substraction..");
		System.out.println("3. Multiplication..");
		System.out.println("4. Division..");
		System.out.println("5. Exit..");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("Enter the first number: ");
			num1=sc.nextInt();
			System.out.print("Enter the second number: ");
			num2=sc.nextInt();
			res=calculator.addition(num1, num2);
			System.out.println("result is: "+num1+"+"+num2+"="+res);
			break;
		case 2:
			System.out.print("Enter the first number: ");
			num1=sc.nextInt();
			System.out.print("Enter the second number: ");
			num2=sc.nextInt();
			res=calculator.substraction(num1, num2);
			System.out.println("result is: "+num1+"-"+num2+"="+res);
			break;
		case 3:
			System.out.print("Enter the first number: ");
			num1=sc.nextInt();
			System.out.print("Enter the second number: ");
			num2=sc.nextInt();
			res=calculator.multiplication(num1, num2);
			System.out.println("result is: "+num1+"*"+num2+"="+res);
			break;
		case 4:
			System.out.print("Enter the first number: ");
			num3=sc.nextFloat();
			System.out.print("Enter the second number: ");
			num4=sc.nextFloat();
			res1=calculator.division(num3, num4);
			System.out.println("result is: "+num3+"/"+num4+"="+res1);
			break;
		case 5:
			System.exit(0);
		}
		}while(choice!=5);
	}
}
