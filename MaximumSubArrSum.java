
public class MaximumSubArrSum {
    static int maxsubarray(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi){
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

}
