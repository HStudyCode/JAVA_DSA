import java.util.Scanner;

public class findTheBiggestNoOf3 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        
        System.out.print("A : ");
        int a=sc.nextInt();
        System.out.print("B : ");
        int b=sc.nextInt();
        System.out.print("C : ");
        int c=sc.nextInt();

        int max =a;

        if (b>max){
            max=b;
        }

        if(c>max){
            max=c;
        }

        System.out.println("Biggest no is = "+max);
    }
}
