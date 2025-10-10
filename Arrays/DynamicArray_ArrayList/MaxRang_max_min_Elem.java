package DynamicArray_ArrayList;

public class MaxRang_max_min_Elem {
    public static void main(String[] args) {
        int[] arr = { 23, 565, 989, 545, 8787, 9898, 656465, 88226 };
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 3));
        System.out.println(min(arr));

    }

    static int maxRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // imagine that array is not empty
    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Minimum
    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

}
