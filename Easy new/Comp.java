import java.util.Scanner;

class Comp
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("enter the value of a:");
		int a =in.nextInt();
		System.out.print("enter the value of b:");
		int b =in.nextInt();
		System.out.print("composite numbers:");
		for(int i=a+1;i<=b;i++)
		{
		int count=1;
		for(int j=2;j<=i;j++)
		{
		if(i%j==0)
		{
		count++;
		}
		}
		if(count>2)
		{
		System.out.print(i+",");
		}
		}
	}
}