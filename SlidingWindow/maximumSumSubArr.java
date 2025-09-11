
/*
 
public class maximumSumSubArr {
    public static int maxSumSubArr(int[] arr, int k) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n-k; i++) {
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        int soln = maxSumSubArr(arr, k);
        System.out.println(soln);
    }
}

 */                 // Tc = O(n*k)

//Optimal Solution

public class maximumSumSubArr {

    public static int maxSumSubArr(int[] arr, int k) {
        int n = arr.length;
        
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = 0;
        for (int i = k; i<n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        int soln = maxSumSubArr(arr, k);
        System.out.println(soln);
    }
    
}



















