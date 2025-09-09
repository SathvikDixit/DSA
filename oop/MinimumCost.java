import java.util.Arrays;
public class MinimumCost {
    public static int minCost(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int cost = 0;

        for(int i = 0; i < n; i++) {
            cost += arr[i] * (n - i);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        int soln = minCost(arr);

        System.out.println("Minimum cost: " + soln);
    }
}
