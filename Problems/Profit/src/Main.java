import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();

        int years = 0;
        //gain = deposit  *  percent * year

        while (k > m) {
            m = m + m * (p/100);
            years ++;
        }
        System.out.println(years);
    }
}