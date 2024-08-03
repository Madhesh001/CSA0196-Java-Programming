import java.io.*;
import java.util.Scanner;

class Strtoint
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		String str;
        System.out.print("Enter the number String:");
        str=in.next();
        int i = Integer.parseInt(str);
		System.out.println("integer:"+i);
			
    }
}