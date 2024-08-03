import java.util.Scanner;

class Evenfibo
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a=-1,b=1,c,sum=0;
		System.out.print("enter the number:");
		int n =in.nextInt();
		int arr[] = new int[(n*2)+1];
		for(int i=0;i<=n*2;i++)
		{
		c=a+b;
		arr[i]=c;
		a=b;
		b=c;
		if(i%2==0)
		{
		sum+=arr[i];
		}
		}
		System.out.println("sum:"+sum);
	}
}