import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var height = scanner.nextInt();
        var up = scanner.nextInt();
        var down = scanner.nextInt();
       var d = (height - up) / (up - down) + 1;
    }
}