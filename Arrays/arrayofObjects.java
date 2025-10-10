import java.util.Arrays;
import java.util.Scanner;

public class arrayofObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // if we want modify
        str[1] = "hara";
        System.out.println(Arrays.toString(str));
    }
}
