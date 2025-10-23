public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 19;
        int ans = ceiling(arr, target);
        System.out.println("Index : " + ans);
    }

    // return the index
    // return -1 if it does not exist

    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target) {
        // But what if the target is greater then the greatest no in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
