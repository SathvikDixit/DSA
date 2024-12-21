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
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    public static void main (String[] args) 
    {
        int[] A = {1,2,3,4,5,6};
        int N = A.length;

        System.out.println("Hello");
        System.out.println("Minimum Element = " +setmini(A, N));
        System.out.println("Maximum element = " +setmax(A, N));
    }
}
