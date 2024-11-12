import java.util.Arrays;

class Candy {
    public int candy(int[] ratings) {
        int candies = 0, n = ratings.length;
        
        // Arrays to store the number of candies from the left and right passes
        int[] left = new int[n];
        int[] right = new int[n];

        // Initially, every child gets 1 candy
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        // Left to right pass: ensure children with higher ratings get more candies than their left neighbor
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        // Right to left pass: ensure children with higher ratings get more candies than their right neighbor
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        // Calculate the total number of candies by taking the maximum candies from left and right passes
        for (int i = 0; i < n; i++) {
            candies += Math.max(left[i], right[i]);
        }

        return candies;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Candy class
        Candy candySolution = new Candy();
        
        // Example input array representing ratings
        int[] ratings = {1, 0, 2};
        
        int result = candySolution.candy(ratings);
        
        System.out.println("Total candies: " + result);  // Output will be 5
    }
}
