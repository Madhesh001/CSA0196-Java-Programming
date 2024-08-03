import java.util.Scanner;
import java.lang.Math;
class Arm
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=in.nextInt();
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
		int x= temp%10;
		sum=sum+((int)Math.pow(x,3));
		temp/=10;
		}
		
		if(n==sum)
		{
		System.out.println(n+" is a Armstrong number");
		}
		else
		{
		System.out.println(n+" is Not a Armstrong number");
		}
		
		
	}
}