import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
            long pwr = 1 ;
            for (; m != 0; --m){
                pwr *= n;
            }
            return pwr;
        }


    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}