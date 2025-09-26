public class Reverse_Num {
    public static void main(String[] args) {
        int num = 167234589;

        int ans=0;

        while(num>0){
           int rem = num % 10;
           num = num/10;

           ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}
