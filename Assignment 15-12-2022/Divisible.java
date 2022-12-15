import java.util.Scanner;

public class Divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.print("Enter the number:  ");
        no=sc.nextInt();
        if(no%5==0 && no%11==0)
        {
            System.out.println("The number is divisible by both 5 and 11..");
        }
        else
        {
            System.out.println("The number is not divisible by both 5 and 11..");
        }
    }
}
