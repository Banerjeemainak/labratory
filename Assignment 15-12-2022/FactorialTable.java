public class FactorialTable
{
    public static void main(String args[])
    {
        int c,f=1;
        System.out.println("Number Factorial");
        for(c=1;c<=10;c++)
        {
            f=f*c;
            System.out.println("Factorial of the number "+c+" is "+f);
        }
    }
}
