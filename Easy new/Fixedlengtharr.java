import java.util.Arrays;

class Fixedlengtharr {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int len = arr.length;
        int i, j;

        for (i = 0; i < len - 1; i++) {
            if (arr[i] == 0) {
                for (j = len - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}