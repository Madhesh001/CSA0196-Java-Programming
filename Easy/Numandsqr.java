import java.util.Scanner;

class Numandsqr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low, high;
        
        System.out.print("Enter lower range: ");
        low = in.nextInt();
        
        System.out.print("Enter upper range: ");
        high = in.nextInt();
        
        if (low > high) {
            System.out.println("Invalid range: lower range is greater than upper range.");
            return;
        }

        int size = high - low + 1;
        int[][] arr = new int[size][2];

        for (int i = 0; i < size; i++) {
            arr[i][0] = low + i;
            arr[i][1] = (low + i) * (low + i);
        }

        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print("(" + arr[i][0] + ", " + arr[i][1] + ")");
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
