import java.io.*;
import java.util.Scanner;

class Uservalid
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i;
		String str1,str2;
		char ch;
        System.out.print("Enter the Username:");
        str1=in.next();
		System.out.print("Renter the Username:");
        str2=in.next();
		if(str1.equals(str2))
		{
		System.out.println("Valid");
		}
		else
		{
		System.out.println("Invalid");
		}	
    }
}