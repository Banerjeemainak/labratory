import java.util.Scanner;

public class VowelConsonent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Enter the character: ");
        c=sc.next().charAt(0);
        if((c>='a' && c<='z')||(c>='A' && c<='Z'))
        {
            if(c=='A'||c=='a'||c=='E'||c=='E'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
            {
                System.out.println("The charater is an vowel...");
            }
            else
            {
                System.out.println("The character is a consonent");
            }
        }
        else
        {
            System.out.println("The charater is not an alphabet...");
        }

    }
}
