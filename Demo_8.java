// Functions / Methods

import java.util.Scanner;

public class Demo_8 {

    public static void main(String[] args) {

        // Q) take input of two number and print the sum

        // sum();
        // sum();

        // string function

        // String message=greet();
        // System.out.println(message);

        int ans = sum3(5, 6);
        System.out.println(ans);

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.println("Sum of two number is: " + sum);
    }

    static String greet() {
        String greeting = "How are you !";
        return greeting;
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
