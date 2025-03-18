public class Swap_2nos_12 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // swap 2 number
        // int temp = a;
        // a=b;
        // b=temp;
        // System.out.println("value of a is "+a);
        // System.out.println("value of b is "+b);

        swap(a, b);

    }

    // swap function
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }
}
