package opps;

import java.util.Scanner;

public class EngineeringBranch {
	public static void stream(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println();
		System.out.println("1. Mechanical Engineering.");
		System.out.println("2. Electronic Engineering.");
		System.out.println("3. Software Engineering.");
		System.out.println("4. Chemical Engineering.");
		System.out.print("Please choose your stream: ");
		ch=sc.nextInt();
		System.out.println();
		switch(ch)
		{
		case 1:
			subject1();
			confirm();
		case 2:
			subject2();
			confirm();
		case 3:
			subject3();
			confirm();
		case 4:
			subject4();
			confirm();
		default:
			System.out.println("Invalid choice: ");
		}
	}
	public static void subject1()
	{
		System.out.println("-----SUBJECTS-----");
		System.out.println("1. Mechanical paper1.");
		System.out.println("2. Mechanical paper2.");
		System.out.println("3. Mechanical paper3.");
	}
	public static void subject2()
	{
		System.out.println("-----SUBJECTS-----");
		System.out.println("1. Electronic paper1.");
		System.out.println("2. Electronic paper2.");
		System.out.println("3. Electronic paper3.");
	}
	public static void subject3()
	{
		System.out.println("-----SUBJECTS-----");
		System.out.println("1. Software paper1.");
		System.out.println("2. Software paper2.");
		System.out.println("3. Software paper3.");
	}
	public static void subject4()
	{
		System.out.println("-----SUBJECTS-----");
		System.out.println("1. Chemical paper1.");
		System.out.println("2. Chemical paper2.");
		System.out.println("3. Chemical paper3.");
	}
	public static void confirm()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		char c;
		System.out.print("Are you sure about your stream and papers?(Y/N) : ");
		c=sc.next().charAt(0);
		if(c=='N')
		{
			stream(null);
		}
		else
		{
			System.out.println();
			System.out.println("Congratulation!!");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		stream(null);
	}

}
