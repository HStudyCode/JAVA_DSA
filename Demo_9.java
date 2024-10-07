public class Demo_9 {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        // swap numbers code
        System.out.println("Before swap "+a + " " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap "+a + " " + b);
    }

}
