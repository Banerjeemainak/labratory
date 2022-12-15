import java.util.Scanner;

public class AlphabetDigitSpecial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Enter the character: ");
        c=sc.next().charAt(0);
        if((c>='a' && c<='z')||(c>='A' && c<='Z'))
        {
            System.out.println("The charater is an alphabet...");
        }
        else if(c>= '0' && c<= '9')
        {
            System.out.println("The character is a digit...");
        }
        else
        {
            System.out.println("The character is a special character...");
        }


    }
}
