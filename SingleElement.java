public class SingleElement {
    public int singleNumber(int[] nums) {
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            number ^= nums[i];
        }
        return number;
    }

    public static void main(String[] args) {
        SingleElement singleElement = new SingleElement();
        
        // Example test case
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleElement.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
