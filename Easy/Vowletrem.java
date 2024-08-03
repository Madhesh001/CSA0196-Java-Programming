import java.util.Scanner;
class Vowletrem
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		String str;
        System.out.print("Enter the Word:");
        str=in.nextLine();
        String s="";
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
		{
		s+=ch;
		}
		}
		str=s;
		System.out.println("String after removing vowels:"+str);	
			
    }
}
