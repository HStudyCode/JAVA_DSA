
import java.util.Scanner;

public class Demo_5 {

    public static void main(String[] args) {

        Scanner inputVar = new Scanner(System.in);
        
        System.out.print("Enter your salary amount: ");

        int salary = inputVar.nextInt();

        if (salary == 20000) {

            salary = salary + 2000;
        } else if (salary > 40000) {
            salary = salary + 3000;

        } else {
            salary = salary + 1000;
        }

        System.out.println("Total salary is: " + salary);
    }

}
