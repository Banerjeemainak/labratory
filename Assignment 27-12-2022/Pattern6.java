*********
 *******
  *****
   ***
    *


package basic;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			for(int c=0;c<i-1;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
