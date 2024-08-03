import java.util.Scanner;
class VowConscount{
public static void main(String args[])
{
 Scanner in = new Scanner(System.in);
 System.out.print("Enter the String:");
 String str=in.nextLine();
 System.out.print("Vowels:");
 for (int i=0;i<str.length();i++)
 {
 char ch=str.charAt(i);
 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
 {
 System.out.print(ch+" ");
 }
 }
 System.out.println();
 System.out.print("Consonents:");
 for (int i=0;i<str.length();i++)
 {
 char ch=str.charAt(i);
 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
 {
 }
 else
 {
 System.out.print(ch+" ");
 }
 }
 }
 }