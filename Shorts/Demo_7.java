package Shorts;

import java.util.Scanner;

public class Demo_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        // if(fruit.equals("mango")){
        //     System.out.println("King of fruits");
        // }
        // if (fruit.equals("Apple")) {
        //     System.out.println("a sweet red fruit");
        // }


        // SwitchCase

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("a sweet red fruit");
                break;
        
            default:
                break;
        }
        
    }
}
