import java.io.*;
import java.util.Scanner;

class persqr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n,j,low,upp,c,sum=0,count=0;
        System.out.println("Enter lower range:");
        low=in.nextInt();
		System.out.println("Enter the upper range:");
        upp=in.nextInt();
		int arr[] = new int[upp];
		j=0;
        for(i=low;i<=upp;i++)
		{
		c=i*i;
		int temp=c;
		while(c!=0)
		{
		int x=c%10;
		sum+=x;
		c/=10;
		}
		if(sum<10)
		{
		if(temp<=upp){
		arr[j]=temp;
		j++;
		count+=1;}
		}
		sum=0;
		}
		for(j=0;j<count;j++)
		{
		System.out.print(arr[j]+",");
		}
		
		
    }
}