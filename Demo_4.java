
import java.util.Scanner;

public class Demo_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter temp in c: ");
        float tempC=in.nextFloat();

        float tempF=((tempC*9/5)+32);
        System.out.println("This is F temp: "+tempF);
    }
}
