
import java.io.*;
import java.util.Scanner;

class Lettercheck
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		String str;
        System.out.print("Enter the String:");
        str=in.nextLine();
        System.out.print("Enter the Letter:");
        char s=in.next().charAt(0);
        int i,j=0;
		for(i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if(ch==s)
		{
		System.out.println(s+" is present at index "+i);
		j=1;
		}
		}
		if(j==0)
		{
		System.out.println(s+" is not present in the given string");
		}
		
		
			
    }
}
