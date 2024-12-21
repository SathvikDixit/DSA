
public class MinAndMaxInArray {
   /*  public static int setmini (int[] A, int N) {
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
    } */      //Space Complexity is n^2

    public static int asdf (int[] A, int N){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < N; i++) {
            if(A[i] < min) {
                min = A[i];
            }
            else if (A[i] > max){
                max = A[i];
            }  
        }
        return min;
        // return max;
    }

    public static void main (String[] args) {
        int[] A = {5,7,3,9,2};
        int N = A.length;

        System.out.println("Minimum Element: " +asdf(A,N));
        System.out.println("Maximum Element: " +asdf(A,N));
    }
}
