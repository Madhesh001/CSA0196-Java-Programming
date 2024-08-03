import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MeanMedianMode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n,s=0,x,j,temp;
        System.out.print("Enter the array size:");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
                System.out.print("Enter element:");
                arr[i] = in.nextInt();
				s+=arr[i];
        }
		for (i = 0; i < n; i++) {
           for(j=i+1;j<n;j++)
		   {
			   if(arr[j]<arr[i])
			   {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
        }
        int mean=s/n;
		int median;
		
		if(n%2==1)
		{
			x=n;
			median=arr[x/2];
		}
		else
		{
			x=n;
			median=(arr[n/2]+arr[x/2])/2;
		}
		int mode = arr[0];
        int maxCount = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (i = 0; i < n; i++) {
            int count = countMap.getOrDefault(arr[i], 0) + 1;
            countMap.put(arr[i], count);
            
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
        
        
        
    }
}
