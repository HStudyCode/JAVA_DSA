import java.util.Arrays;

public class Array_Basics {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // print elemnt of the array using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        System.out.println(" ");
        // using to string to print the element of array
        System.out.println(Arrays.toString(arr));
    }
}
