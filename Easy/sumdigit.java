import java.lang.*;
import java.util.Scanner;

class sumdigit
{
	public static void main(String args[])
	{
		int i,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number:");
		int n = in.nextInt();
		while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
		System.out.println("sum:"+sum);
	}
}