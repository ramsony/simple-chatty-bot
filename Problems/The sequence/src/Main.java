import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        int counter = 0;

        while (num <= n){
            for (int i = 1; i <= num; i ++) {
                System.out.print(num + " ");
                counter++;
                if (counter == n) {
                    break;
                }
            }
            num++;
            if (counter == n) {
                break;
            }
        }
    }
}