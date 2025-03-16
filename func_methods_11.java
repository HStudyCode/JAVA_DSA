import java.util.Scanner;

public class func_methods_11 {
    public static void main(String[] args) {
        // function_call->

        // int ans = sum3(45,54);
        // System.out.println("Sum is: " + ans);


        userinputs();
    }

    // using parameters

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
    // without parameters
    static void userinputs(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the num2: ");
        int num2= scan.nextInt();
        int ans = sum3(num1, num2);
        System.out.println("Sum is: " + ans);
    }

}