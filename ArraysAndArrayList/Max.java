package ArraysAndArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 9, 18 };
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    // assuming that array is not empty
    private static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }  
        int maxItem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxItem) {
                maxItem = arr[i];
            }
        }
        return maxItem;
    }

    // assuming that array is not empty
    private static int maxRange(int[] arr, int start, int end) {
        int maxItem = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxItem) {
                maxItem = arr[i];
            }
        }
        return maxItem;
    }
}
