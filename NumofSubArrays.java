public class NumOfSubArrays {
    public int numOfSubarrays(int[] arr) {
        long ans = 0;
        long odd = 0;
        long even = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                long temp = even;
                even = odd;
                odd = temp;
                odd++;
            }
            ans += odd;
        }
        return (int) (ans % (Math.pow(10, 9) + 7));
    }

    // You can add a main method to test the code if needed
    public static void main(String[] args) {
        NumOfSubArrays solution = new NumOfSubArrays();
        int[] arr = { 1, 2, 3 }; // Example array
        System.out.println(solution.numOfSubarrays(arr)); // Outputs the number of subarrays with an odd sum
    }
}



