package LinearSearchAlgorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 23;
        int ans = linearSearch(num, target, 2, 8);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (var index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;
    }

}
