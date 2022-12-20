package basic;

import java.util.*;

public class bank_Transaction {

	public static double deposit(double a)
	{
		double balance=10000;
		balance=balance+a;
		return balance;
	}
	public static double withdraw(double a)
	{
		double balance=10000;
		balance=balance-a;
		return balance;
	}
	public static double balance_acc()
	{
		double balance=10000;
		return balance;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		double bal,m,n;
		do
		{
			System.out.println("Which operation you want to perform..");
			System.out.println("1. Deposit..");
			System.out.println("2. withdraw..");
			System.out.println("3. balance..");
			System.out.println("4. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Enter the amount you want to add: ");
				m=sc.nextDouble();
				bal=bank_Transaction.deposit(m);
				System.out.println("Deposit amount is: "+m);
				System.out.println("balance: "+bal);
				break;
			case 2:
				System.out.print("Enter the amount you want to withdraw: ");
				n=sc.nextDouble();
				bal=bank_Transaction.withdraw(n);
				System.out.println("Withdraw amount is: "+n);
				System.out.println("balance: "+bal);
				break;
			case 3:
				bal=bank_Transaction.balance_acc();
				System.out.println("Balance: "+bal);
				break;
			case 4:
				System.exit(0);
			}
		}while(choice!=4);
	}
}
