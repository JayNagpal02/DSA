package ArraysAndArrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
