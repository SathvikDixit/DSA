
/*
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
 */     // TC = O(n*k)

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegNum {
 
    public static void firstNegtivNum(int arr[], int k) {
        int n = arr.length;
        Queue <Integer> q = new LinkedList<>();
        int i =0, j = 0;

        while (j < n) {
            if (arr[j] < 0) {
                q.add(j);
            }

            if (j - i + 1 == k) {
                if (!q.isEmpty()) {
                    System.out.print(arr[q.peek()] + " ");
                } else {
                    System.out.print("0 ");
                }

                if (!q.isEmpty() && q.peek() == i) {
                    q.poll();
                }
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-5, 4, 3, -3, -2, 7};
        int k = 2;
        firstNegtivNum(arr, k);
    }
}
