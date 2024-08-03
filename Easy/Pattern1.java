import java.util.Scanner;


class Pattern1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		int n,i,j,k,temp=1,count;
        System.out.print("Enter the no of rows:");
        n=in.nextInt();
		count=n-1;
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=count;j++)
		{
		System.out.print(" ");
		}
		for(k=1;k<=temp;k++)
		{
		System.out.print("* ");
		}
		count--;
		temp++;
		System.out.println();
		}		
    }
}