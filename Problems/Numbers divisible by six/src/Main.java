import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int sequenceOfNumber;
        int sumDivBySix = 0;

        for (int i = 0; i < noOfElements; i++) {
            sequenceOfNumber = scanner.nextInt();
            if (sequenceOfNumber % 6 == 0){
                sumDivBySix += sequenceOfNumber;
            }
        }
        System.out.println(sumDivBySix);
    }
}