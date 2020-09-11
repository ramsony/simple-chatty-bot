import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;


        while (scanner.hasNext()) {
            int sequence = scanner.nextInt();
            if (sequence != 0) {
                sum += sequence;
            }else{
                break;
            }
        }System.out.println(sum);
    }
}