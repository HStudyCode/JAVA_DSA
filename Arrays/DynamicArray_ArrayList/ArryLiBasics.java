package DynamicArray_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArryLiBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(67);
        // list.add(654);
        // list.add(98);
        // list.add(878);
        // list.add(87879);
        // list.add(123456);

        // // using array functions
        // System.out.println(list.contains(796545));
        // System.out.println();
        // System.out.println(list);
        // System.out.println();
        // list.set(0,99);
        // System.out.println();

        // list.remove(2); // index 2 means 98 remove
        // System.out.println(list);

        // input using for loop
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

        // Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
