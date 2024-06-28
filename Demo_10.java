
import java.util.Scanner;

public class Demo_10 {
    public static void main(String[] args) {
        // Q: store 5 roll no's

        // array syntax
        // datatype[] arrayName = new datatype[size];

        // int[] rolls=new int[5];
        // // or
        // int[] rolls1={22,56,98,75,65};

        // System.out.println(rolls[0]);
        // System.out.println(rolls1[0]);

        // //string array syntax

        // String[] name={"I","Am","Programmer"};
        // System.out.println(name[0]);
        // System.out.println(name[1]);
        // System.out.println(name[2]);
        // System.out.println(name[3]);

        // input using for loop
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
