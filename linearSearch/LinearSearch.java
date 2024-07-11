package linearSearch;

// for integer

public class LinearSearch 
{

    public static void main(String[] args) 
    {
        int[] nums = {23, 45, 65, 98, 8, 9, 7};
        int target = -98;

        int ans = LinearS(nums, target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if iteam not found return -1
    static int LinearS(int[] arr, int target) 
    {
        if (arr.length == 0) 
        {
            return -1;
        }

        // run a for loop

        // for (int index = 0; index < arr.length; index++) 
        // {
        //     //check for element at every index if it is = target
        //     int element = arr[index];
        //     if (element == target) 
        //     {
        //         return index;
        //     }
        // }


        for (int element:arr){
            if (element == target){
                return element;
            }
        }




        //this line will execute if none of the return statements above have executed
        //hence the target not found


        return -1;

    }
    
}
