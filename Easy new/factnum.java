import java.util.*;
import java.util.ArrayList;
class factnum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=in.nextInt();
		System.out.print("Enter the target:");
		int t=in.nextInt();
		ArrayList<Integer> fact=new ArrayList<>();
		for(int i=1 ;i<n ;i++)
		{
			if(n%i==0)
			{
				fact.add(i);
			}
		}
		System.out.println("ArraySize:"+fact.size());
		System.out.print("target value:"+fact.get(t-1));


	}
}