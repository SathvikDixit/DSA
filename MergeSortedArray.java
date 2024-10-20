class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1; 
        int index = m + n - 1; 

        while (right >= 0) {
            if (left >= 0 && nums1[left] > nums2[right]) {
                nums1[index] = nums1[left]; 
                left--; 
            } else {
                nums1[index] = nums2[right]; 
                right--; 
            }
            index--; 
        }        
    }

    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();
        
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3; 
        
        int[] nums2 = {2, 5, 6};
        int n = 3; 

        solution.merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}



