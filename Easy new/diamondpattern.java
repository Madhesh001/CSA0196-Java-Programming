import java.util.*;
class diamondpattern
{
 public static void main(String args[])
 {
  int n;
  Scanner in= new Scanner(System.in);
  System.out.println("enter the number:");
  n=in.nextInt();
  int i,j,k,count=n-1;
            for(i=1;i<=2*(n)-1;i+=2)
            {
                for(k=1;k<=count;k++)
                {
                    System.out.print(" ");
                }
                count--;
                for(j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            count=1;
            for(i=2*(n)-1;i>=1;i-=2)
            {
             if(i!=(2*(n)-1)){  
                for(k=1;k<=count;k++)
                    {
                     System.out.print(" ");
                    }
                    count++;
                for(j=i;j>=1;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
             }
            }
        }


  }
 