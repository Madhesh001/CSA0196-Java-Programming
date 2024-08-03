import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class ReverseAlphaStr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		String str;
        System.out.print("Enter the Word:");
        str=in.nextLine();
        Character arr[]= new Character[str.length()];
		for(int i=0;i<str.length();i++)
		{
		arr[i]=str.charAt(i);
		}
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.print("Alphabetic Reverse:");
		for(char c:arr)
		{
		System.out.print(c+" ");
		}
		
		
			
    }
}