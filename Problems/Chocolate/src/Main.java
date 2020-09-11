import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int k = scanner.nextInt();

        if ((k % n == 0 || k % m == 0) && (k < m * n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}