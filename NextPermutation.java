class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        // Find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If we found a decreasing element
        if (i >= 0) {
            int j = nums.length - 1;
            // Find the first element that is greater than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap the found elements
            swap(nums, i, j);
        }

        // Reverse the sequence from i+1 to the end of the array
        int start = i + 1;
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    // You can add a main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        solution.nextPermutation(nums);
        // Output the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
