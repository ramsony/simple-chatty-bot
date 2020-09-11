import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String starts = scanner.nextLine();
        boolean startsJ = starts.toLowerCase().startsWith("j");
        System.out.println(startsJ);
    }
}