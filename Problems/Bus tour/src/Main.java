import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfBus  = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int heightOfBridges;
        int counter = 0;
        while (scanner.hasNext()) {
            heightOfBridges = scanner.nextInt();
            counter++;
            if (heightOfBus >= heightOfBridges) {
                System.out.println("Will crash on bridge " + counter);
                break;
            }
            if (counter == numberOfBridges) {
                System.out.println("Will not crash");
                break;
            }
        }
    }
}