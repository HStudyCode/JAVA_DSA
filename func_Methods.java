import java.util.Scanner;

public class func_Methods {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the text : ");
        String name = in.next();
        System.out.print("The Input : ");
        printTheInput(name); // call the function
        System.out.println();


        System.out.print("Enter the a : ");
        int a = in.nextInt();

        System.out.print("Enter the b : ");
        int b = in.nextInt();
        System.out.print("The Sum : ");
        calculateSum(a, b);  // call the function

    }

    public static int calculateSum(int a, int b) {

        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static void printTheInput(String name) {

        System.out.println(name);
        return;
    }

}
