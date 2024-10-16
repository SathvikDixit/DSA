class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1; // Pointer for the last element in nums1 that is part of the initial array
        int nidx = n - 1; // Pointer for the last element in nums2
        int right = m + n - 1; // Pointer for the last position in nums1 (combined array length)

        // Loop until all elements from nums2 have been merged
        while (nidx >= 0) {
            // If nums1 still has elements left and the current element in nums1 is greater than nums2
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx]; // Move the larger element to the end of nums1
                midx--; // Move left in nums1
            } else {
                nums1[right] = nums2[nidx]; // Move the element from nums2 to nums1
                nidx--; // Move left in nums2
            }
            right--; // Move left in nums1
        }        
    }

    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();
        
        // Example: nums1 has space for elements from nums2
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3; // Number of elements initially in nums1
        
        int[] nums2 = {2, 5, 6};
        int n = 3; // Number of elements in nums2

        solution.merge(nums1, m, nums2, n);

        // Print the result after merging
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
