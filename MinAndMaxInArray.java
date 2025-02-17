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

    public static int setmax (int[] A, int N) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i] ;
            }
        }
        return max;
    }      
    public static void main (String[] args) {
        int[] A = {5,7,3,9,2};
        int N = A.length;

        System.out.println("Minimum Element: " +setmini(A, N));
        System.out.println("Maximum Element: " +setmax(A,N));
    }
}
                    // TC = O(N)  |   SC = O(1)