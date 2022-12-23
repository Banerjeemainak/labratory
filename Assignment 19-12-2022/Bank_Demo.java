package basic;

import java.util.*;

public class Bank_Demo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String c_name=sc.nextLine();
		System.out.print("Enter your customer id: ");
		String c_id=sc.nextLine();
		Bank_Account ob=new Bank_Account(c_name,c_id);
		ob.show();
	}

}

class Bank_Account
{
	float balance;
	float prev_Trans;
	String cust_name,cust_id;
	
	Bank_Account(String name,String id)
	{
		cust_name=name;
		cust_id=id;
	}
	
	void deposit(float amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			prev_Trans=amount;
		}
	}
	void withdraw(float amount)
	{
		if(amount>balance)
		{
			System.out.println("You have not sufficient balance..");
		}
		else
		{
			balance=balance-amount;
			prev_Trans=-amount;
		}
	}
	void previous_transaction()
	{
		if(prev_Trans>0)
		{
			System.out.println("Amount deposited: "+prev_Trans);
		}
		else if(prev_Trans<0)
		{
			System.out.println("Amount withdrawn: "+Math.abs(prev_Trans));
		}
		else
		{
			System.out.println("No transaction recorded..");
		}
	}
	
	void show()
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome  "+cust_name);
		System.out.println("Your ID is: "+cust_id);
		do
		{
			System.out.println("1. Check balance..");
			System.out.println("2. Deposit..");
			System.out.println("3. Withdraw..");
			System.out.println("4. Show previous transaction..");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Your current balance is: "+balance);
				System.out.println();
				break;
			case 2:
				System.out.print("Enter your amount to deposit: ");
				float am=sc.nextFloat();
				deposit(am);
				System.out.println();
				break;
			case 3:
				System.out.print("Enter your amount to withdraw: ");
				float am1=sc.nextInt();
				withdraw(am1);
				System.out.println();
				break;
			case 4:
				previous_transaction();
				System.out.println();
				break;
			case 5:
				System.out.println("Thank you,visit again!!!");
				System.exit(0);
			default:
				System.out.println("Invalid option,Please enter again!!!");
			}
		}while(choice!=5);
	}
}
