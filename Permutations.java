import java.util.ArrayList;
import java.util.List;

public class Permutations {

    // Helper function to generate all permutations using recursion
    private void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        // Base case: if we've reached the end of the array, add the current permutation to the answer
        if (index == nums.length) {
            // Create a new list to store the current permutation
            List<Integer> ds = new ArrayList<>();
            // Add elements from the nums array to ds
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            // Add the current permutation to the answer list
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Loop through the remaining elements to generate all permutations
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            // Recur for the next index
            recurPermute(index + 1, nums, ans);
            // Backtrack by swapping the elements back to their original positions
            swap(i, index, nums);
        }
    }

    // Helper function to swap two elements in the array
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    // Main function to get all permutations of the input array
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // Call the helper function starting from index 0
        recurPermute(0, nums, ans);
        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        Permutations solution = new Permutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.permute(nums);

        // Print the result
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
