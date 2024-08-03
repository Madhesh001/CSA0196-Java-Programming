import java.util.*;
class Numpall
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
		int n,i,rev=0;
        System.out.print("Enter the number:");
        n=in.nextInt();
		int temp=n;
		while(n!=0)
		{
		i=n%10;
		rev=rev*10+i;
		n/=10;
		}
		if(temp==rev)
		{
		 System.out.println("pallindrome");
		}
		else
		{
		 System.out.println(" not pallindrome");
		}
  }

  
 }
