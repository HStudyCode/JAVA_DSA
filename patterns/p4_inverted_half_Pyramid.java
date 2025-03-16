package patterns;

import java.util.Scanner;

public class p4_inverted_half_Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int num = scan.nextInt();


        for (int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
