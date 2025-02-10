










public class ReversingArray {
    static void revArray(int[] arr) {
        int n = arr.length;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++)
        temp[i] = arr[n - i -1];

        for (int i = 0; i < n; i++)
        arr[i] = temp[i];
    }

    public static void main (String[] args) {
        int[] arr = { 2 , 4 , 6 , 5 , 8 , 9 };

        System.out.print("Old Array ");
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
        System.out.println("");
        revArray(arr);

        System.out.print("New Array ");
        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}