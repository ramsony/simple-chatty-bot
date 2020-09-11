import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int latQueen1 = scanner.nextInt();
        int lngQueen1 = scanner.nextInt();
        int latQueen2 = scanner.nextInt();
        int lngQueen2 = scanner.nextInt();


        if (latQueen1 == latQueen2 || lngQueen1 == lngQueen2) {
            System.out.println("NO");                              // One has picked another
        } else if (latQueen1 == latQueen2 || lngQueen1 == lngQueen2) {
            System.out.println("YES");                                // Row or column
        } else if (Math.abs(latQueen1 - latQueen2) == Math.abs(lngQueen1 - lngQueen2)) {
            System.out.println("YES");                                // Diagonal
        }
        else {
            System.out.println("YES");
        }
    }
}