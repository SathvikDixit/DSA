










import java.util.Arrays;
public class Duplicate {
    static boolean checkDuplicate (int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                return true;
        }
        return false;
    }

    public static void main (String[] args) {
        int[] arr = { 4, 5, 6, 4};
        System.out.println(checkDuplicate(arr));
    }
}