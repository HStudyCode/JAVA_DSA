// let array is int[] arr={1,23,34,56,78,89,09,14,45,42,56,67,86}

// Q) Search in the array: return the index if item found 
// otherwise item not found return -1

package linearSearch;

import java.util.Arrays;

public class find_a_num {
    public static void main(String[] args) {
        int[] nums = { 1, 23, 34, 56, 78, 89, 90, 14, 45, 42, 56, 67, 86 };

        int target = 14;

        // int[] ans = linearSearch(nums, target);
        // System.out.println("Index and element is : " + Arrays.toString(ans));

        // boolean ans = linearSearch(nums, target);
        // System.out.println("Index is present: " + ans);
        int ans = linearSearch(nums, target);
        System.out.println("Index is : " + ans);

    }

    // static int[] linearSearch(int[] arr, int target) {
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            // return new int[]{-1, -1}; // Return array with both values as -1
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target) {
                System.out.println("Element is : " + element);
                return index;
                // return new int[]{index, element}; // Return both index and element
            }
        }
        // if not found the element
        return -1;
        // return new int[]{-1, -1};

    }

    // boolean value -->

    // static boolean linearSearch(int[] arr, int target) {
    //     if (arr.length == 0) {
    //         return false;
    //     }

    //     // run a for loop
    //     for (int index = 0; index < arr.length; index++) {
    //         int element = arr[index];

    //         if (element == target) {

    //             return true;
    //         }
    //     }
    //     // if not found the element
    //     return false;

    // }

}
