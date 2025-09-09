public class FirstNegNum {
    public static void firstNegtivNum(int[] arr,int k) {
        int n = arr.length;

        for (int i = 0; i <= n-k; i++) {
            Boolean found = false;

            for (int j = i; j < i+k; j++) {
                if (arr[j] < 0) {
                    System.out.print(arr[j]+" ");
                    found = true;
                }
            }
            if (!found){
                System.out.print("0 ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        firstNegtivNum(arr, k);
    }
}
