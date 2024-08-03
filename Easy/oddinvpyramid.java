import java.util.*;
class oddinvpyramid
{
 public static void main(String args[])
 {
  int n=5;
  int r=3;
  int i,j,k,count=n-1,left=1,right=2;
            for ( i = r; i >= 1; i--) {
            for ( j = 0; j < r - i; j++) {
                System.out.print(" ");
            }
            for ( k = 1; k <= 2 * i - 1; k++) {
                System.out.print(n + " ");
            }
            n -= 2;
            System.out.println();
        }



  }
}
 