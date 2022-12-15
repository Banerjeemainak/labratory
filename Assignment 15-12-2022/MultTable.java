import java.util.Scanner;
public class MultTable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,no;
        System.out.println("Enter the number:  ");
        no=sc.nextInt();
        System.out.println("...Multiplication table...");
        for(i=1;i<=10;i++)
        {
            System.out.println(no+"*"+i+":"+(no*i));
        }
    }
}
