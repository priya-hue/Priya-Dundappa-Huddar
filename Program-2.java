import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        int currentOdd = 1;
        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            System.out.print(currentOdd);
            if (i < a) {
                System.out.print(", ");
            }
            currentOdd += 2;
        }
    }
}

