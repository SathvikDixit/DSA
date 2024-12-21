
public class MinAndMaxInArray {
    public static int setmini (int[] A, int N) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] < mini){
                mini = A[i];
            }
        }
        return mini;
    }


}
