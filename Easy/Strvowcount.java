import java.io.*;
import java.util.Scanner;

class Strvowcount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		String str;
        System.out.print("Enter the String:");
        str=in.nextLine();
        int i,count=0;
		for(i=0;i<str.length();i++)
		{
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
		{
		count++;
		}
		}
		System.out.println("vowels count:"+count);
		
			
    }
}