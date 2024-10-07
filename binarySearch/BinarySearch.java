package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14,16,18,20};
        int target=18;
        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }


    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while (start<=end) {
            // find middle element
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
