import java.util.Scanner;

class Leap
{
	public static void main(String args[])
	{
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter the date in this format dd/mm/yyyy :");
	  String date=in.nextLine();
	  String datesplit[] = date.split("/");
	  int year = Integer.parseInt(datesplit[2]);
	  if(year%4==0 ||(year%100==0 && year%400==0))
	  {
	  System.out.println("Given Year is Leap Year");
	  }
	  else if(year%4==0 && (year%100==0 && year%400!=0))
	  {
	  System.out.println("Given Year is Leap Year");
	  }
	  else
	  {
	  System.out.println("Given Year is Not A Leap Year");
	  }
	  
		
	}
}