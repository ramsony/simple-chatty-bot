import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contains = scanner.nextLine();
        boolean endsWith = contains.endsWith("burg");
        System.out.println(endsWith);
    }
}