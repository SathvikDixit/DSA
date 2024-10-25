
public class NumOfSubArrays {
    public int numOfSubarrays(int[] arr) {
        long ans = 0; // This will hold the final count of odd-sum subarrays.

        int even = 0; // Count of prefix sums that are even.
        int odd = 0;  // Count of prefix sums that are odd.
        int sum = 0;  // This will keep track of the running sum of elements.

        for (int val : arr) { // Loop through each element in the array.
            sum += val; // Add the current element to the running sum.

            if (sum % 2 == 0) { // Check if the current sum is even.
                ans += odd; // Add the count of odd prefix sums seen so far to the answer.
                even++; // Increment the count of even prefix sums.
            } else { // If the sum is odd.
                ans += 1 + even; // Add 1 (the current odd sum) plus the count of even prefix sums.
                odd++; // Increment the count of odd prefix sums.
            }
        }
        return (int)(ans % (1000000007)); // Return the answer, ensuring it fits within standard integer limits.
    }

    // You can add a main method to test the code if needed
    public static void main(String[] args) {
        NumOfSubArrays solution = new NumOfSubArrays();
        int[] arr = {1, 2, 3}; // Example array
        System.out.println(solution.numOfSubarrays(arr)); // Outputs the number of subarrays with an odd sum
    }
}
