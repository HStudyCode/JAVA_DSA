import java.util.Scanner;

public class ternary_conditional_operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you age : ");
        int age =sc.nextInt();

        String drink = age>=5 ?"coffee":"milk";
        System.out.println("Drink : " + drink);
    }
}