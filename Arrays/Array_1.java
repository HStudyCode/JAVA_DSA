import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array of objects
        int[] arr = new int[5];

        // arr[0] = 01;
        // arr[1] = 02;
        // arr[2] = 03;
        // arr[3] = 04;
        // arr[4] = 05;
        // System.out.println(arr[4]);

        // input using for loop
        System.out.println("Enter numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // printing loop
        // for (int i=0; i<arr.length; i++){
        // System.out.print(arr[i] + " ");
        // }

        // using for-each loop
        // for(int num : arr){ // for every element of array, print the element
        // System.out.print(num+ " ");// here num represent element of array
        // }

        // using to string
        System.out.println(Arrays.toString(arr));
        System.out.println("Array length"+arr.length);

    }
}
