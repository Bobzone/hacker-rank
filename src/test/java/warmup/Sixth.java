package warmup;

import java.util.Scanner;

class Sixth {
    static void plusMinus(int[] arr) {
        int arrSize = arr.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
