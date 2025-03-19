public class Scope_14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // int a = 34; // already initialize outside the block in the same method, hence
            // you cannot initialized again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 87;
            // values initialized int this block, will remain in block
        }
        // System.out.println(c); //cannot use outside the block
    }

    static void random(int marks) {
        int num = 80;
        System.out.println(num);
        System.out.println(marks);
    }
}
