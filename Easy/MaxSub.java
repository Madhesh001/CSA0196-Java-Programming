import java.util.Arrays;

class MaxSub {
    public static void main(String[] args) {
        int[] arr = {-2, 1,-3, 4,-1, 2, 1,-5, 4};
        int len = arr.length;
        int i, j;
		int c=arr[0];
		int m=arr[0];

        for (i = 0; i < len; i++) {
            c= (arr[i]>c+arr[i])?arr[i]:(c+arr[i]);
			m = (m>c)?m:c; 
        }
        System.out.println("sum:"+m);
    }
}