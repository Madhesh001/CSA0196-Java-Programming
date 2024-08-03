import java.util.Scanner;

class Pattern3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		int n,i,j;
        System.out.print("Enter the no of rows:");
        n=in.nextInt();
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=4*n-1;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		}		
    }
}