import java.util.Scanner;
import java.lang.Math;
class SquareandCube
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number:");
		Float n=in.nextFloat();
		double square = Math.pow(n, 2);
        double cube = Math.pow(n, 3);
		System.out.printf("Square Number:%.2f\n",square);
		System.out.printf("Cube Number:%.3f\n",cube);
		
		
	}
}