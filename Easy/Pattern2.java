import java.util.Scanner;

class Pattern2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();
        
        int count = n - 1;
        
        for (int i = 0; i < n; i++) {
            int x = 1;
            
            // Print leading spaces
            for (int j = 0; j < count; j++) {
                System.out.print("   ");
            }
            
            // Print binomial coefficients
            for (int k = 0; k <= i; k++) {
                System.out.printf("%6d", x);
                x = x * (i - k) / (k + 1);
            }
            
            count--;
            System.out.println();
        }
    }
}