import java.util.Scanner;

class Nthodd
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int arr[] = new int[500];
		int i,s=0;
		for(i=1;i<=1000;i++)
		{
		if(i%2==1)
		{
		arr[s]=i;
		s++;
		}
		}
		System.out.print("Enter the number:");
		int n=in.nextInt();
		System.out.println(n+"th odd number is:"+arr[n-1]);
		System.out.print(n+"odd numbers after"+arr[n-1]+"is:");
		for(i=n;i<2*n;i++)
		{
		System.out.print(arr[i]+",");
		}
			
	}
}