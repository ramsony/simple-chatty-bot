import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfParts = scanner.nextInt();
        int fixed = 0, reject = 0, ship = 0;
        int large = 1, smaller = -1, perfect = 0;

        for (int i = 0; i < numberOfParts; i++) {
            int parts = scanner.nextInt();

            if (parts == large){
                fixed++;
            } else if (parts == smaller) {
                reject++;
            } else if (parts == perfect) {
                ship ++;
            }

        }
        System.out.println(ship + " " + fixed + " " + reject);

    }
}