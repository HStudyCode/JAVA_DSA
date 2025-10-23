// first and last position of element in sorted numsay

public class LQ_FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 5, 9, 9, 14, 16, 18 };
        int target = 9;
        int[] ans = searchRange(nums, target); // Changed to int[]
        System.out.println("First position: " + ans[0] + ", Last position: " + ans[1]);
    }

    // return the index of smallest no >= target
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };

        // check for first occurrence if target is first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find middle element
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
