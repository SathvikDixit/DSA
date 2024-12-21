public class MaxAndMin_inArray {
    public static int setmini(int[] A, int N) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++){
            if(A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }

    public static int setmax (int[] A, int N) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i > max; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    

}
