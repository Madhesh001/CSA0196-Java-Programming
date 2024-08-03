import java.util.Scanner;
import java.lang.Math;
class Dectobinandbintodec
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n,j=1,bin=0,rev=0,inc=0,dec=0;
        System.out.print("Enter the number:");
        n=in.nextInt();
		int temp=n;
		while(n!=0)
		{
		i=n%2;
		bin=bin+(i*j);
		n/=2;
		j*=10;
		}
		System.out.println("binary value:"+bin);
		while(bin!=0)
		{
		i=bin%10;
		rev=rev*10+i;
		bin/=10;
		}
		System.out.println("reverse of the binary:"+rev);
		while(rev!=0)
		{
		i=rev%10;
		dec=dec+(i*((int)Math.pow(2,inc)));
		rev/=10;
		inc++;
		}
		System.out.println("reversed binary to dec:"+dec);
		
		
    }
}