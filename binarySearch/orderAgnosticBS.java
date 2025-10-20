

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { -18, -12, -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = -2;

        int ans = orderAgnosticBS(arr, target);
        System.out.println("Index is : "+ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        // same thing as above
        // if (arr[start] < arr[end]){
        // isAsc = true;
        // }else{
        // isAsc=false;
        // }

        while (start <= end) {
            // find middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
